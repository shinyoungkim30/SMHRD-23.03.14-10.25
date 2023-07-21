import React, { useContext, useState } from 'react'
import Ex03Header from './components/Ex03Header'
import Ex03Main from './components/Ex03Main'
import { ThemeContext } from './context/Ex03ThemeContext'

const Ex03 = () => {

  // 어플리케이션의 Theme와 관련된 데이터
  // => 전역적으로 사용, 관리 => context

  const [isDark, setIsDark] = useState(false);

  return (
    <ThemeContext.Provider value={{isDark, setIsDark}}>
      <div>
          <Ex03Header/>
          <Ex03Main/>
      </div>
    </ThemeContext.Provider>
  )
}

export default Ex03

/* 내가 작성했던 코드
  import React, { useState } from 'react'
  import Header from './components/Ex03Header'
  import Main from './components/Ex03Main'
  import { ThemeContext } from './context/Ex03ThemeContext'

  const Ex03 = () => {

      const [isDark, setIsDark] = useState(false);

    return (
      <ThemeContext.Provider value={{isDark, setIsDark}}>
          <div style={(isDark) ? {backgroundColor : 'black'} : {backgroundColor : 'white'}}>
              <Header/>
              <Main/>
          </div>
      </ThemeContext.Provider>
    )
  }

  export default Ex03 */