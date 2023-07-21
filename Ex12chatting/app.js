const express = require('express')
const indexRouter = require('./routes')
const memberRouter = require('./routes/member')
const chatRouter = require('./routes/chat')
const bodyParser = require('body-parser')
const nunjucks = require('nunjucks')
const {sequelize} = require('./models')
const webSocket = require('./socket')
const session = require('express-session')
const fileStore = require('session-file-store')(session)
const app = express()

app.use(session({
    httpOnly : true, // http 통신할때만 허용
    secret : 'secretkey', // 암호화 키 설정
    resave : false, // 세션에 수정사항이 없더라도 다시 저장할 것인지
    cookie : { // 쿠키 설정
        httpOnly : true
    },
    store : new fileStore()
}))

app.use(express.urlencoded({extended:true}))
app.use(bodyParser.json()) // json 형태 데이터 다룰 때 추가!

// force : false -> 기존 테이블은 건들지 않음
sequelize.sync({force : false})
.then(() => {
    console.log('DB 연결성공!');
})
.catch((err) => {
    console.log(err);
})

// 정적리소스 경로 지정(css, js(front-end) ...)
app.use(express.static(__dirname + '/public'))

app.set('views', __dirname + '/views')
app.set('view engine', 'html')

nunjucks.configure('views', {
    express : app,
    watch : true
})

app.use('/', indexRouter)

app.use('/member', memberRouter)

app.use('/chat', chatRouter)

app.set('port', process.env.PORT || 8888)
const server = app.listen(app.get('port'), () => {
    console.log(app.get('port'), '번 포트에서 서버연결 기다리는 중...');
})

webSocket(server, app)