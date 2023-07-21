const express = require('express')
const indexRouter = require('./routes')
const path = require('path')
const app = express()
const cors = require('cors')

app.use(express.json())
app.use(cors())

// react-project에서 build한 index.html 파일을 보여줄 준비
// 특정 폴더에 있는 자료들을 사용자에게 보여줄 때 사용
// __dirname : 현재 실행하는 파일의 절대 경로
app.use(express.static(path.join(__dirname, 'react-project/build')))

app.use('/', indexRouter)

app.set('port', process.env.PORT || 8888)
app.listen(app.get('port'), () => {
    console.log(app.get('port'), '번 포트에서 서버연결 대기중..');
})