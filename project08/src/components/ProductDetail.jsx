import React from 'react'
import { useParams, Link } from 'react-router-dom'

const ProductDetail = ({list}) => {

  // console.log(list);

  let {idx} = useParams()

  console.log(idx);

  return (
    <div className='list-container'>
      <div className='detail-item'>
        <img src={list[idx].src} width='200px'></img>
        <h3>{list[idx].title}</h3>
        <p>
          <span>가격 : {list[idx].price}원</span>{" "}

          {/* 만약에 배송비가 무료라면 '배송비 무료!'라고 띄워주고
            배송비가 유료라면 '배송비 3000원'으로 띄워주기 */}
          {list[idx].delivery == 'free' ?
           <span>배송비 무료!</span> :
           <span>배송비 {list[idx].delivery}원</span>}
        </p>
        <br/>
        <Link to="/productlist">목록으로 돌아가기</Link>
      </div>
    </div>
  )
}

export default ProductDetail