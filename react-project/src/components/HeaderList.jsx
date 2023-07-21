import React from 'react'
import { Link } from 'react-router-dom'

const HeaderList = () => {
  return (
    <div className='headerlist-box'>
      <ul>
        <li><Link to={'/join'}>회원가입</Link></li>
        <li><Link to={'/login'}>로그인</Link></li>
        <li><Link to={'/'}>메인창</Link></li>
      </ul>
    </div>
  )
}

export default HeaderList