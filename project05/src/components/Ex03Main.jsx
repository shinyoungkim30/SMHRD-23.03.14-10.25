import React, { useContext } from 'react'
import { ThemeContext } from '../context/Ex03ThemeContext'

const Ex03Main = () => {

  const {isDark, setIsDark} = useContext(ThemeContext);

  const toggleTheme = ()=>{
    setIsDark(!isDark)
  }

  return (
    <div style={{
      backgroundColor : isDark ? 'black' : 'white',
      color : isDark ? 'white' : 'black'
    }}>
        Ex03Main
        <br/>
        <button onClick={toggleTheme}>다크모드</button>
    </div>
  )
}

export default Ex03Main

/* 내가 작성했던 코드
import React, { useContext } from 'react'
import { ThemeContext } from '../context/Ex03ThemeContext'

const Ex03Main = () => {

    const {isDark, setIsDark} = useContext(ThemeContext);

  return (
    <div style={(isDark) ? {color : 'white'} : {color : 'black'}}>Ex03Main
        <br/>
        <button onClick={()=>{isDark==false ? setIsDark(true) : setIsDark(false)}}>다크모드</button>
    </div>
  )
}

export default Ex03Main */