import React, { useRef } from 'react'

const Ex07 = () => {

    /* 
    1) 사용자가 input 태그 안에 입력한 값을 가져오기
    2) 그 값에 따라서 사진의 src 속성을 변경하기 */

    const inputRef = useRef();
    const imgRef = useRef();

    const btnCk = () => {
        // console.log(inputRef.current.value, imgRef.current.src);
        inputRef.current.value == '유재석' 
            ? imgRef.current.src = 'https://i.namu.wiki/i/8v-u8zB8iSKgmKF1qz1v7x-hvWd_01piinEwr9CsjVwuPQ7ZsWIBDAezj3u35JD_YjuloR9VsUyAWxXwzDNkcg.webp'
            : imgRef.current.src = 'https://i.namu.wiki/i/R0AhIJhNi8fkU2Al72pglkrT8QenAaCJd1as-d_iY6MC8nub1iI5VzIqzJlLa-1uzZm--TkB-KHFiT-P-t7bEg.webp'
        
        inputRef.current.value = '';
        inputRef.current.focus();
    }

  return (
    <div>
        <p>희망하는 사진이 있으신가요?</p>
        <input ref={inputRef} type='text'/>
        <button onClick={btnCk}>변경!</button>

        <div>
            <img 
            ref={imgRef}
            src='https://i.namu.wiki/i/R0AhIJhNi8fkU2Al72pglkrT8QenAaCJd1as-d_iY6MC8nub1iI5VzIqzJlLa-1uzZm--TkB-KHFiT-P-t7bEg.webp'
            width='200px'></img>
        </div>
    </div>
  )
}

export default Ex07