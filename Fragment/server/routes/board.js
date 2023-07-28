const express = require('express')
const db_config = require('../config/database')
const {v4:uuidv4} = require('uuid')
const fs = require('fs')
const router = express.Router()

const conn = db_config.init()
db_config.connect(conn)

router.get('/', (req, res) => {

    let sql = 'select * from andboard'
    conn.query(sql, (err, rows) => {
        if (err) {
            console.log(err);
            res.send('Fail')
        } else {
            res.send(rows)
        }
    })
})

router.post('/write', (req, res) => {
    let {title, content, writer, img} = JSON.parse(req.body.board)

    // img 파일 디코딩(Base64)
    let decode = Buffer.from(img, 'base64')

    // 그대로 파일 이름으로 사용(중복되지 않는 랜덤한 문자열 생성)
    const uuid = uuidv4()
    // 파일 저장되는 기본 경로 : 프로젝트 폴더 바로 아래 (기준)
    fs.writeFileSync('public/img/board/' + uuid + '.jpg', decode)

    let sql = 'insert into andboard values (null,?,?,?,?,null)'
    conn.query(sql, [title, content, writer, uuid], (err, rows) => {
        if (err) {
            console.log(err);
            res.send('Fail')
        } else {
            res.send('Success')
        }
    })
})

module.exports = router