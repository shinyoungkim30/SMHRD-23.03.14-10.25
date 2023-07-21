// 1. '원하는 색상을 입력하세요'라는 입력창 만들기
let inputcolor = prompt('색상을 입력해주세요. (빨강, 초록, 파랑)')
// 2. 빨강 -> red 초록 -> green 파랑 -> blue
// 그 외에는 '잘못 입력하셨습니다.' (알림 팝업창)

// if문
// if (inputcolor === '빨강') {
//     document.getElementById('bodyTag').style.backgroundColor = 'red';
// } else if (inputcolor === '초록') {
//     document.getElementById('bodyTag').style.backgroundColor = 'green';
// } else if (inputcolor === '파랑') {
//     document.getElementById('bodyTag').style.backgroundColor = 'blue';
// } else {
//     alert('잘못 입력하셨습니다.');
// }

// switch문
let result = '';
switch (inputcolor) {
    case '빨강': result = 'red'; break;
    case '초록': result = 'green'; break;
    case '파랑': result = 'blue'; break;
    default: alert('잘못 입력하셨습니다.')        
}
document.getElementById('bodyTag').style.backgroundColor = result;