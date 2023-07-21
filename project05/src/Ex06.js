import React, { useRef } from 'react'

const Ex06 = () => {

    let pdfStyle = {
        width : '100%',
        height : '90%'
    }

    let pdf1 = 'http://localhost:3000/pdf/pdf1.pdf';
    let pdf2 = 'http://localhost:3000/pdf/pdf2.pdf';

    const pdfRef = useRef();

    const changePdf = (path)=>{
        pdfRef.current.src = `http://localhost:3000/pdf/pdf${path}.pdf`;
    }

    const chBtnClick = ()=>{
        // console.log(pdfRef.current.src);
        if(pdfRef.current.src == pdf1) {
            changePdf(2);
        } else {
            changePdf(1);
        }
        // 삼항연산자 사용
        // pdfRef.current.src == 'http://localhost:3000/pdf/pdf1.pdf'
        //     ? pdfRef.current.src = '/pdf/pdf2.pdf'
        //     : pdfRef.current.src = '/pdf/pdf1.pdf'
    }

  return (
    <div style={{ height : '100vh' }}>
        <h3>오늘의 학습자료
            <button onClick={chBtnClick}>변경</button>
        </h3>
        <iframe
        ref={pdfRef}
        style={pdfStyle} src='/pdf/pdf1.pdf'></iframe>
    </div>
  )
}

export default Ex06