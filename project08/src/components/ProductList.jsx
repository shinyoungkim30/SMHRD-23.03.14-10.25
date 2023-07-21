import React from 'react'
import ProductItem from './ProductItem'
import axios from 'axios'
import { useEffect } from 'react';

const ProductList = ({list, setList}) => {

  /* Mission!
  1) public 안에 두었던 bestList.json 값을 가지고 올 것
    => axios 이용, useEffect 이용, useState 배열 이용
  2) 가지고 온 데이터를 state값 관리
    => map 함수, props 처리 (index 값도) */  

  useEffect(()=>{
    axios.get('http://localhost:3000/bestList.json')
    .then(res => {
      // console.log(res.data.list);
      setList(res.data.list)
    })
  },[])

  return (
    <div className='list-container'>
      {/* {list.map(item => <ProductItem list={item} />)} */}
      {list.map((item, idx)=>(
        <ProductItem key={item.no} list={item} idx={idx} />
      ))}
    </div>
  )
}

export default ProductList