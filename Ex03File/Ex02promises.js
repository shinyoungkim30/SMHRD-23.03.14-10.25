// promises : 비동기 처리 시 콜백함수에 늪에 빠질 수 있는 단점을 보완
const fs = require('fs').promises

fs.readFile('./file1.txt')
.then((data) => { // 작업 성공
    console.log(data.toString());
})
.catch((err) => { // 작업 수행 중 오류가 발생
    console.log(err);
})