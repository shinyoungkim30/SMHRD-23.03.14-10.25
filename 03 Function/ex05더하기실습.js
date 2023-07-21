// 두 개의 숫자를 입력 받기
let num1 = Number(prompt('첫번째 정수 입력'));
let num2 = Number(prompt('두번째 정수 입력'));

// 1. 함수 선언문
function addNumber1() {
    return num1+num2;
}
// 2. 함수 표현식
const addNumber2 = function() {
    return num1+num2;
}
// 3. 화살표 함수
const addNumber3 = ()=>{
    return num1+num2;
}

// 출력하여 결과 확인
console.log('함수 선언문', addNumber1());
console.log('함수 표현식', addNumber2());
console.log('화살표 함수', addNumber3());