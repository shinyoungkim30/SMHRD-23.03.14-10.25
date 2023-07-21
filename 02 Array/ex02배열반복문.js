// 배열에 저장된 데이터를 반복문으로 출력하기!

// 1. for문
let nameList = ['김신영', '이선아', '이유영', '김다운'];
for(let i=0; i<nameList.length; i++){
    console.log(nameList[i]);
}

// 2. for of문
let foodList = ['피자', '치킨', '햄버거'];
for(let i of foodList){
    console.log(i);
}

// 3. forEach문
let colorList = new Array('초록', '파랑', '보라');
colorList.forEach((element, index)=>{
    console.log(index, element);
})