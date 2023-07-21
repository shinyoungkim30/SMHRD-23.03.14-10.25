import React from 'react'
import { useState } from 'react';

const Ex01review = () => {
    const [num, setNum] = useState(0)

    const plus = ()=>{
        setNum(num+1);
    }
    const minus = ()=>{
        setNum(num-1);
    }
    
  return (
    <div>
        <p>{num}</p>
        {/* <button onClick={()=>{setNum(num+1)}}>+1</button>
        <button onClick={()=>{setNum(num-1)}}>-1</button> */}
        <button onClick={plus}>+1</button>
        <button onClick={minus}>-1</button>
    </div>
  )
}

export default Ex01review