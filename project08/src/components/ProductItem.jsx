import React from 'react'
import { Link, useNavigate } from 'react-router-dom'

const ProductItem = ({list, idx}) => {

  /* Mission!
  1) 누군가가 item을 선택했을 때, 해당 아이템에 대한 productDetail로 이동
    => 상품별로 고유번호 '/detail/1', '/detail/2' */

  console.log(list, idx);

  const nav = useNavigate()

  return (
    <div className='product-container' onClick={()=>{nav(`/productdetail/${idx}`)}}>
        <img src={list.src} width='100px'></img>
        <p>{list.title}</p>
        <p>{list.price}원</p>
    </div>
  )
}

export default ProductItem