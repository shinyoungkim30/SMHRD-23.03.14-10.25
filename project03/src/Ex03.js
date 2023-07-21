import React, { useState } from 'react'

const Ex03 = () => {

    /* 랜덤 게임을 해보자!
    
    1) 랜덤한 수를 뽑아주자 1~3
    2) 내가 누른 버튼의 숫자를 구해보자
    3) 1 숫자와 2숫자를 비교
        - 만약 두 숫자가 같다면 정답입니다!
        - 만약 두 숫자가 다르다면 땡!
        
    단, 각각 변화하는 수들은 바로 화면에 보여지게 한다. */

    const [myNum, setMyNum] = useState(0);
    const [ranNum, setRanNum] = useState(0);

    const btnCk = (e)=>{
        // 랜덤 숫자
        setRanNum(parseInt(Math.random()*3+1));
        // 내가 선택한 숫자
        setMyNum(e.target.innerText);
    }   

  return (
    <div>
        <button onClick={btnCk}>1</button>
        <button onClick={btnCk}>2</button>
        <button onClick={btnCk}>3</button>
        <div>
            <p>내가 입력한 숫자 : {myNum}</p>
            <p>랜덤 숫자 : {ranNum}</p>
            {/* 숫자 비교하기 */}
            {myNum == ranNum ? <p>정답입니다!</p> : <p>땡!</p>}
        </div>
    </div>
  )
}

export default Ex03