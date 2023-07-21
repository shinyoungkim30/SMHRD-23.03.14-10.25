const http = require('http')
const fs = require('fs').promises
const url = require('url')
const qs = require('querystring')

const server = http.createServer( async (req, res) => {
    // url 다루기! -> url 모듈 사용
    let reqUrl = req.url
    let pathname = url.parse(reqUrl, true).pathname

    console.log(req.method);

    if (pathname === '/api/form') {
        const f = await fs.readFile('./Ex04.html')
        res.writeHead(200, {'Content-Type': 'text/html; charset=UTF-8'})
        res.write(f)
        res.end()
    } else if (req.method === 'POST') {
        if (pathname === '/api/join') {

            let body = ''

            // data 이벤트(data가 들어오는 이벤트)가 발생하면 함수 호출
            // 들어오는 데이터들을 하나로 묶어주는 작업
            req.on('data', function(data) {
                body += data
            })
            // data가 이제 더이상 들어오지 않을 때 발생!
            req.on('end', function() {
                let data = qs.parse(body)

                console.log(data);

                let pw1 = data.pw1
                let pw2 = data.pw2

                res.writeHead(200, {'Content-Type': 'text/html; charset=UTF-8'})
    
                let html = '<html>'
                html += '<body>'
                html += '<h3>아이디 : ' + data.id + '</h3>'
                if (pw1 === pw2) {
                    html += '<h3>비밀번호가 일치합니다</h3>'
                } else {
                    html += '<h3>비밀번호가 일치하지 않습니다</h3>'
                }
                html += '<h3>성별 : ' + data.gender + '</h3>'
                html += '<h3>혈액형 : ' + data.bloodType + '</h3>'
                html += '<h3>생일 : ' + data.birthday + '</h3>'
                html += '<h3>취미 : ' + data.hb + '</h3>'
                html += '<h3>좋아하는 색깔 : ' + data.color + '</h3>'
                html += '<h3>남기는 말 : ' + data.textarea + '</h3>'
                html += '</body>'
                html += '</html>'
        
                res.write(html)
                res.end()
            })
        }
    }
})

server.listen(8888)
server.on('listening', () => {
    console.log('8888번 포트에서 서버 연결 기다리는 중...');
})