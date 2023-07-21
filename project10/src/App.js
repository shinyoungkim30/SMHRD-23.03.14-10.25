import { useEffect, useState } from 'react';
import './App.css';
import Header from './components/Header';
import ProductDetail from './components/ProductDetail';
import ProductList from './components/ProductList';
import { Routes, Route } from 'react-router-dom'
import axios from 'axios'

function App() {

  const [list, setList] = useState([])

  useEffect(()=>{
    // 화면이 mount 되었을 때 back-end Data를 가져오겠다.
    axios.get('http://172.30.1.55:8090/shop/')
    .then((res) => {
      // console.log('결과 :', res.data);
      setList(res.data)
    })
  }, [])

  return (
    <div className="App">
      <Header />
      <Routes>
        <Route path='/' element={<ProductList list={list} />}></Route>
        <Route path='/product/:num' element={<ProductDetail/>}></Route>
      </Routes>
    </div>
  );
}

export default App;
