// rafce + Enter
import React from 'react' // 생략가능
import './AppExample.css'
import MemberBox from './components/MemberBox'

const AppExample = () => {

    /* 여러분의 팀원을 소개해주세요!
        이름 : 홍길동
        성별 : 여성 / 남성
        좋아하는 노래 : 아이브 - I AM
        
        단, Component와 props의 개념을 이용할 것
        - MemberBox라는 컴포넌트를 생성하기 */
    
    // let man = '남성';
    // let woman = '여성';
    let {man, woman} = {
        man : '남성',
        woman : '여성'
    }
  return (
    <div>
        <MemberBox name="신영" gender={man} favorite="잠 못드는 밤 비는 내리고"></MemberBox>
        <MemberBox name="영석" gender={man} favorite="Ditto"></MemberBox>
        <MemberBox name="현록" gender={woman} favorite="Hype Boy"></MemberBox>
        <MemberBox name="지영" gender={woman} favorite="꽃"></MemberBox>
    </div>
  )
}

export default AppExample