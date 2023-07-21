// 1. 사용자로부터 시작 숫자와 마지막 숫자를 입력받는다.
let start = Number(prompt('시작할 숫자를 입력하세요'));
let end = Number(prompt('마지막 숫자를 입력하세요'));

// 2. 시작~마지막 숫자까지의 합을 구한다.
let result = 0;
for(let i=start; i<=end; i++){
    result += i;
}

// 3. 결과값을 콘솔창으로 출력해준다.
console.log(`${start}부터 ${end}까지의 합은? >> ${result}`);