const mysql = require('mysql2')

const db_info = {
    host : 'localhost',
    port : '3306',
    user : 'root',
    password : '1234',
    database : 'node'
}

module.exports = {
    init : function() {
        return mysql.createConnection(db_info)
    },
    connect : function(conn) {
        conn.connect(function(err) {
            if (err) console.log('연결 실패!')
            else console.log('연결 성공!')
        })
    }
}