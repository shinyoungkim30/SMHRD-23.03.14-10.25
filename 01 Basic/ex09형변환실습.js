// 1. num1 -> '100', num2 -> 200
let num1 = "100";
let num2 = 200;
let sum = num1 + num2;
// console.log(sum);
sum = Number(num1) + num2;
// console.log(sum);

// 2. 콘솔창에 형태에 맞춰 출력
// num1과 num2의 합 >> num1+num2
// console.log(num1 + '과 ' + num2 + '의 합 >> ' + sum);

// Template literals(템플릿 리터럴)
// : 표현식/문자열 삽입, 여러 줄 문자열 등 다양한 기능을 제공
// -> 백틱(`) 기호 사용
// -> 표현식 : ${data}
console.log(`${num1}과 ${num2}의 합 >> ${sum}`);
console.log(`안녕하세요.
반갑습니다.`);