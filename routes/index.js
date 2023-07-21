const express = require('express')
const router = express.Router()
const path = require('path')

// DB 초기화 및 연결
const db_config = require('../config/database')
let conn = db_config.init()
db_config.connect(conn)

router.get('/', (req, res) => {
    console.log('index Router');
    res.send(path.join(__dirname, 'react-project/build/index.html'))
})

router.post('/user/join', (req, res) => {
    console.log('Join Router!', req.body);
    let {id, pw, adr} = req.body.userData

    // 중복체크 시작!
    // DB에서 중복체크를 진행한 후, DB안에 없는 ID만 회원가입을 진행
    // 만약 중복이라면 console창에 '중복!'
    // 아니라면 '중복X, 회원가입 가능!'
    let sql = "select * from member2 where id = ?"
    conn.query(sql, [id], (err, rows) => {
        if (rows.length > 0) {
            // console.log('중복!');
            res.json({result : 'duplicated'})
        } else {
            // console.log('중복X, 회원가입 가능!');
            // 회원가입 시작!
            sql = "insert into member2 values (?,?,?)"
            conn.query(sql, [id, pw, adr], (err, rows) => {
                if (rows) {
                    console.log('joined successfully!');
                    res.json({result : 'success'})
                } else {
                    console.log('Failed to Join...');
                    res.json({result : 'failed'})
                }
            })
            // 회원가입 끝!
        }
    })
    // 중복체크 끝!
})

router.post('/user/login', (req, res) => {
    // console.log('Login Router!');
    let {id, pw} = req.body.userData

    let sql = 'select * from member2 where id = ? and pw = ?'
    conn.query(sql, [id, pw], (err, rows) => {
        if (rows.length > 0) {
            res.json({result : 'success', id : id})
        } else {
            res.json({result : 'failed'})
        }
    })
})

module.exports = router