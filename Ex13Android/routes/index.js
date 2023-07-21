const express = require('express')
const db = require('../config/database')
const router = express.Router()

const conn = db.init()
db.connect(conn)

// http://172.30.1.55:8888/join
router.post('/join', (req, res) => {
    console.log(req.body.AndMember);
    let {id, pw, tel, birth} = JSON.parse(req.body.AndMember)

    let sql = 'insert into andmember values (?, ?, ?, ?)'

    conn.query(sql, [id, pw, tel, birth], function(err, rows, fields) {
        if (err) { // 오류 발생
            console.log(err);
            res.send('Fail')
        } else {
            console.log(rows);
            
            if (rows.affectedRows > 0) {
                res.send('Success')
            } else {
                res.send('Fail')
            }
        }
    })
})

router.post('/login', (req, res) => {
    console.log(req.body.LoginMember);
    let {id, pw} = JSON.parse(req.body.LoginMember)

    let sql = 'select * from andmember where id = ? and pw = ?'

    conn.query(sql, [id, pw], function(err, rows, fields) {
        if (err) {
            console.log(err);
            res.send('Fail')
        } else {
            console.log(rows);

            if (rows[0]) {
                res.send('Success')
            } else {
                res.send('Fail')
            }
        }
    })
})

module.exports = router