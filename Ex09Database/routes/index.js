const express = require('express')
const db = require('../config/database')
const router = express.Router()

const conn = db.init() // 연결 객체 생성, 반환
db.connect(conn) // 연결

// member 테이블 전체 정보 가져오기
router.get('/select', (req, res) => {
    // 템플릿엔진 : html 양식(템플릿) + 데이터 -> 결과 문서(nunjucks)
    //              => 가지고 온 데이터를 활용해서 화면 렌더링

    let sql = 'select * from member'
    
    conn.query(sql, function(err, rows, fields) { // 결과 처리(err - 오류, rows - select 결과(데이터), fields - 결과외의 메타데이터)        
        // console.log(err);
        // console.log(rows);
        // console.log(fields);

        res.render('index', {list : rows}) // key : value
    })    
})

router.get('/select/:id', (req, res) => {
    let id = req.params.id

    let sql = 'select * from member where id=?'

    conn.query(sql, [id], function(err, rows, fields) {
        console.log(rows);

        // json 형태로 데이터를 응답 {key : value}
        res.json({member : rows})
    })
})

router.post('/insert', (req, res) => {
    // 사용자가 입력한 id, pw, nick (POST -> BODY) -> body parsing 할 수 있도록 설정! (app.js)
    let {id, pw, nick} = req.body

    let sql = 'insert into member values (?,?,?)'

    conn.query(sql, [id, pw, nick], function(err, rows, fields) {
        console.log(rows);
        // /select로 다시 요청하게 만들기! (redirect)
        res.redirect('/select')
    })
})

router.post('/update', (req, res) => {
    let {id, pw, nick} = req.body

    let sql = 'update member set pw=?, nick=? where id=?'

    conn.query(sql, [pw, nick, id], function(err, rows, fields) {
        console.log(rows);
        res.redirect('/select')
    })
})

router.get('/delete/:id', (req, res) => {
    let id = req.params.id

    let sql = 'delete from member where id=?'

    conn.query(sql, [id], function(err, rows, fields) {
        console.log(rows);
        res.redirect('/select')
    })
})

module.exports = router