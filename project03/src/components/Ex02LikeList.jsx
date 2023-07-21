import React from 'react'
import { useState } from 'react';

const Ex02LikeList = () => {
    const [heart, setHeart] = useState('♡');
    const [num, setNum] = useState(0);

    const cklike = ()=>{
        if(heart === '♡'){
            setHeart('♥')
            setNum(1)
        } else {
            setHeart('♡')
            setNum(0)
        }
    }
  return (
    <div>
        <span onClick={cklike}>{heart}</span>{" "}
        <span>좋아요 {num}개</span>
    </div>
  )
}

export default Ex02LikeList