// 반복문 : 어떤 조건을 만족할 때까지 같은 처리를 반복하여 실행하는 구문

// 1. while문
console.log('1-1. while문');
let num1 = 0;
while (num1 < 3) {
  console.log(num1);
  num1++;
}
console.log('1-2. while문(true)');
let num2 = 3;
while (true) {
  console.log(num2);
  num2++;
  if (num2 === 6) break;
}

// 2. do-while문
console.log('2. do while문');
let num3 = 6;
do {
  console.log(num3);
  num3++;
} while (num3 < 9);

// while문 do while문 비교
let num4 = 9;
while (num4 < 9) {
  console.log('while문', num4);
}
do {
  console.log('do while문', num4);
} while (num4 < 9);

// 3. for문
console.log('3. for문');
for(let num5=9; num5<12; num5++){
    console.log(num5);
}