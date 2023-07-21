import React from 'react'

const Ex02MenuItem = ({name, price, img, content}) => {
  return (
    <div>
        <img width="200px" src={img}/>
        <p>
            <span>{name}</span>
            <span>{price}원</span>
        </p>
        <p>{content}</p>
    </div>
  )
}

export default Ex02MenuItem