import Button from 'react-bootstrap/Button';
import Col from 'react-bootstrap/Col';
import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';
import 'bootstrap/dist/css/bootstrap.min.css';
import { useEffect, useRef, useState } from 'react';
import axios from 'axios'
import { useNavigate } from 'react-router-dom'

function Join() {

  const nav = useNavigate()

  const idRef = useRef()
  const pwRef = useRef()
  const adrRef = useRef()

  const [userData, setUserData] = useState({})

  const handleJoin = (e) => {
    // console.log('handle Join Function', idRef.current.value, pwRef.current.value, adrRef.current.value);

    // form이 submit 되지 못하도록 작업
    e.preventDefault()
    
    setUserData({
      id : idRef.current.value,
      pw : pwRef.current.value,
      adr : adrRef.current.value
    })
  }

  useEffect(() => {
    // console.log('userData :', userData.id);

    /* useEffect의 특성상, 무조건 화면의 첫 갱신때 함수가 호출될 수밖에 없다.
      비어있는 값을 가지고 회원가입을 하면 안되니까 화면의 첫 갱신때는 회원가입 로직이
      실행되지 않도록 조건을 걸어둔 것! */
    userData.id !== undefined && 
      axios.post('http://localhost:8888/user/join', {
        userData : userData
      })
      .then((res) => {
        // console.log(res.data.result);
        if (res.data.result == 'success') {
          alert('회원가입에 성공하셨습니다!')
          nav('/')
        } else if (res.data.result === 'duplicated') {
          alert('중복된 아이디입니다. 다시 입력해주세요.')
          idRef.current.focus()
        }
      })
      .catch(() => {
        console.error('Failed to Join');
      })
  }, [userData])

  return (
    <div className='main-box info-box'>
      <Form onSubmit={handleJoin}>
        <Row className="mb-3">
          <Form.Group as={Col} controlId="formGridEmail">
            <Form.Label>ID</Form.Label>
            <Form.Control type="text" placeholder="Enter ID" ref={idRef} />
          </Form.Group>

          <Form.Group as={Col} controlId="formGridPassword">
            <Form.Label>Password</Form.Label>
            <Form.Control type="password" placeholder="Password" ref={pwRef} />
          </Form.Group>
        </Row>

        <Form.Group className="mb-3" controlId="formGridAddress1">
          <Form.Label>Address</Form.Label>
          <Form.Control placeholder="1234 Main St" ref={adrRef} />
        </Form.Group>       

        <Button variant="primary" type="submit">
          Submit
        </Button>
      </Form>
    </div>
  );
}

export default Join;