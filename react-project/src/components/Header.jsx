import React from 'react'
import { Link } from 'react-router-dom'

const Header = () => {
  return (
    <div className='header-box'>
      <h1>
        <Link to='/'>camel Case</Link>        
      </h1>
    </div>
  )
}

export default Header