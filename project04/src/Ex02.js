import React from 'react'
import menu from './menu.json';
import MenuItem from './components/Ex02MenuItem';
import './Ex02.css';

const Ex02 = () => {
  console.log('menu :', menu.list);

  let filterList = menu.list.filter(item => item.price >= 4200);

  return (
    <div>
      <h1>전체메뉴</h1>
      <div className='menu-container'>
        {menu.list.map(item => 
            <MenuItem key={item.name} name={item.name} price={item.price} img={item.imgSrc} content={item.content}/>)}
      </div>
      <h1>4200원보다 비싼 메뉴들</h1>
      <div className='menu-container'>
      {filterList.map(item => 
            <MenuItem key={item.name} name={item.name} price={item.price} img={item.imgSrc} content={item.content}/>)}
      </div>
    </div>
  )
}

export default Ex02