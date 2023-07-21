// 1. 주어진 데이터를 담은 배열을 생성한다. (1~8)
let list = [1,2,3,4,5,6,7,8];
// 2. 데이터에서 홀수인 숫자를 찾고 개수를 세준다.
let oddList = [];
let cnt = 0;
// for문
// for(let i=0; i<list.length; i++){
//     if(list[i]%2!=0){
//         oddList[cnt]=list[i];
//         cnt++;
//     }
// }

// for of문
for(let i of numList){
    if(i%2==1){
        oddList[cnt] = i;
        cnt++;
    }
}
// 3. 결과를 팝업창으로 출력해준다.
alert(`list에 들어있는 홀수는 ${oddList}이며, 총 ${cnt}개입니다.`)