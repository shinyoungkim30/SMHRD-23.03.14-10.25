package com.ksy.ex230720

data class KakaoVO(var imgID: Int? = 0, var name: String? = "", var msg: String? = "", var time: String? = "") {
    // ChildEvent 클래스에서 DataSnapshot을 KakaoVO로 형변환하고 있음
    // => getValue(KakaoVO::class.java)
    // 중요! 형변환시 반드시 기본생성자가 정의되어 있어야 함
    // 기본생성자 => 매개변수가 하나도 없는 생성자
    // 생성자는 객체를 생성할 때 함께 호출되는 메서드
    // ex) new KakaoVO() => 기본생성자 호출
    // ex) new KakaoVO(1, 2, 3, 4, 5) => 매개변수가 5개 있는 생성자 호출
    // kotlin에서 기본생성자 만드는 방법 => 매개변수에 null값을 허용해주면 된다.
}
