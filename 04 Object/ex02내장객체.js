// 내장 객체 : 자바스크립트에서 제공하는 객체
// Array, Math, Date, ...

let today = new Date();
let yesterday = new Date(2023, 3, 27, 0, 0, 0);
console.log('오늘 :', today);
console.log('어제 :', yesterday);

// 필요한 데이터 하나씩 가져오기!
let tYear = today.getFullYear();
let tMonth = today.getMonth()+1;
let tDate = today.getDate();
let tDay = today.getDay(); // 0~6 (일~토)
let tHour = today.getHours();
let tMinute = today.getMinutes();
let tSecond = today.getSeconds();

if(tDay==0){
    tDay = '일';
}else if(tDay==1){
    tDay = '월';
} else if(tDay==2){
    tDay = '화';
} else if(tDay==3){
    tDay = '수';
} else if(tDay==4){
    tDay = '목';
} else if(tDay==5){
    tDay = '금';
} else {
    tDay = '토';
}

// 출력형태 -> 콘솔창
// 00년 0월 0일 0요일
// 0시 0분 0초
console.log(`${tYear}년 ${tMonth}월 ${tDate}일 ${tDay}요일`);
console.log(`${tHour}시 ${tMinute}분 ${tSecond}초`);