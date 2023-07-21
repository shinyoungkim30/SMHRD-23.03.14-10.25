import React, { useContext } from 'react'
import ListItem from './Ex04ListItem'
import { TodoContext } from '../context/Ex04TodoContext'

const Ex04List = () => {

    const {todos} = useContext(TodoContext);

  return (
    <div>
        {todos.map((item, idx) => 
            <ListItem todo={item} index={idx} key={item.text+idx}/>           
        )}
    </div>
  )
}

export default Ex04List