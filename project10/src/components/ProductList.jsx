import React, { useState } from 'react'
import { useNavigate, useSearchParams } from 'react-router-dom';

const ProductList = ({list}) => {

    // console.log('props :', list);
    
    /* 만약, '원피스' 페이지를 클릭하면 type이 dress 인것만
    '전체' 페이지를 클릭하면 전체 */
    
    const [typeParams, setTypeParams] = useSearchParams()
    
    // console.log(typeParams.get('type'));
    
    let type = typeParams.get('type')
    
    // type filter 작업을 거치고 사용할 list
    let newList = type !== null && list.filter(item => item.product.ptype == 'dress')

    const nav = useNavigate()

  return (
    <div>
        {/* Q. 상품명 - 가격을 10개 상품 모두 띄워줄 것 */}

        {type == null ? 
            list.map(item => 
                <div key={item.product.pcode} onClick={()=>{nav(`/product/${item.product.pcode}`)}}>
                    <img width='100px' src={'data:image/; base64,' + item.product.img}></img>
                    <p><strong>{item.product.pname}</strong> {item.product.price}원</p>
                </div>
                )
            :
            newList.map(item => 
                <div key={item.product.pcode}>
                    <img width='100px' src={'data:image/; base64,' + item.product.img}></img>
                    <p><strong>{item.product.pname}</strong> {item.product.price}원</p>
                </div>
                )
        }
    </div>
  )
}

export default ProductList