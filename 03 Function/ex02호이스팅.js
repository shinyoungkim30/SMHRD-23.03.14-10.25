// 호이스팅 : 선언문이 코드의 선두로 끌어올려진 것처럼 동작하는 현상

// 소스코드 처리 과정 : 평가 -> 실행
// 평가 : 모든 선언문(변수, 함수 등) 등록
// 실행(런타임)

// 변수 호이스팅
console.log(lunchMenu);
// undefined -> 선언O, 할당X
var lunchMenu = '미니돈까스';
console.log(lunchMenu);
// console.log(dinnerMenu);
// let dinnerMenu = '연어초밥';

// 함수 호이스팅
hoisting('위');
function hoisting(val) {
    console.log(val, '함수 선언문');
}
hoisting('아래');

// hoisting2('위'); -> 에러
const hoisting2 = function(val) {
    console.log(val, '함수 표현식');
}
hoisting2('아래');