// 1. 이모티콘, 행의 개수 입력 받기
let emo = prompt('이모티콘 입력');
let num = Number(prompt('행의 개수'));

// 2. 이모티콘을 행의 개수에 맞춰 피라미드 형태로 출력하는 함수 만들기
const pyramid = (emo, num)=>{
    for(let j=1; j<=num; j++){
        for(let i=1; i<=j; i++){
            document.write(emo);
        }
        document.write('<br>')
    }
}

pyramid(emo, num);