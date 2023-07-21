import React, { useContext } from 'react'
import { ThemeContext } from '../context/Ex03ThemeContext'

const Ex03Header = () => {

  const {isDark} = useContext(ThemeContext);

  return (
    <div style={{
      backgroundColor : isDark ? 'black' : 'white',
      color : isDark ? 'white' : 'black'
    }}>Ex03Header</div>
  )
}

export default Ex03Header

/* 내가 작성했던 코드
import React, { useContext } from 'react'
import { ThemeContext } from '../context/Ex03ThemeContext'

const Ex03Header = () => {

  const {isDark} = useContext(ThemeContext);

  return (
    <div style={(isDark) ? {color : 'white'} : {color : 'black'}}>Ex03Header</div>
  )
}

export default Ex03Header */