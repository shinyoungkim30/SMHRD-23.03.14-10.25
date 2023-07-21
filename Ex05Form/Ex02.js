const http = require('http')
const url = require('url')
const fs = require('fs').promises

const server = http.createServer( async (req, res) => {
    console.log(req.url);

    let reqUrl = req.url
    let pathname = url.parse(reqUrl, true).pathname

    if (pathname === '/form') {
        const f = await fs.readFile('./Ex02.html')
        res.writeHead(200, {'Content-Type': 'text/html; charset = UTF-8'})
        res.write(f)
        res.end()
    } else if (pathname === '/result') {        
        let queryData = url.parse(reqUrl, true).query
        let num1 = parseInt(queryData.num1)
        let num2 = parseInt(queryData.num2)
        let ope = queryData.ope
        let result = 0

        res.writeHead(200, {'Content-Type': 'text/html; charset = UTF-8'})

        if (ope === '+') {
            result = num1 + num2
        } else if (ope === '-') {
            result = num1 - num2
        } else if (ope === '*') {
            result = num1 * num2
        } else {
            result = num1 / num2
        }

        let html = '<html>'
        html += '<body>'
        html += '<h3>' + num1 + ' + ' + num2 + ' = ' + result + '</h3>'
        html += '</body>'
        html += '</html>'

        res.write(html)
        res.end()
    }

})

server.listen(8888)
server.on('listening', () => {
    console.log('8888번 포트에서 서버 연결 기다리는 중 ...');
})