package com.ksy.ex230720

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    // Custom RecyclerView : 데이터의 개수만큼 Template을 복사하여 RecyclerView 안에 배치
    // 1. Data
    // 2. Template
    // 3. Adapter
    //  - ViewHolder도 만들어야함 : 템플릿에 있는 뷰 저장
    lateinit var rv: RecyclerView
    lateinit var btn_send: Button
    lateinit var edt_msg: EditText

    // FireBase => 구글 클라우드 서버
    // 목적 : Android 개발자가 서버를 구현하는 번거로움을 해소!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.listView)
        btn_send = findViewById(R.id.btn_send)
        edt_msg = findViewById(R.id.edt_msg)

        // App에 연결되어있는 FireBase DataBase 객체 가져오기
        val database = Firebase.database
        // DataBase 경로 가져오기
        val myRef = database.getReference("message")

        var data = ArrayList<KakaoVO>()

        // 내가 보낸 채팅 오른쪽에 띄우는 법
        // 1. template.xml 파일에 오른쪽 톡 추가! (중요! 같은 파일에 추가할 것)
        // 2. 현재 로그인한 ID를 adapter에 생성자로 전달! => 메시지 주인
        // 3. adapter 클래스의 onBindView 메서드에서 data.get(position).name (메시지 주인)과 생성자로 전달된 id를 비교
        // 4. 일치한다면 왼쪽 뷰들은 전부 gone, 오른쪽 뷰들은 visiable
        // tip! template에 뷰가 추가됐으니 ViewHolder도 수정필요

        // adapter생성
        var adapter: KakaoAdapter = KakaoAdapter(applicationContext, R.layout.template, data)

        // ** LayoutManager 생성
        rv.layoutManager = LinearLayoutManager(applicationContext) // 목록형
        rv.adapter = adapter

        btn_send.setOnClickListener {

            myRef.push().setValue(KakaoVO(R.drawable.img1, "이름1", edt_msg.text.toString(), "시간1"))
            // adapter 새로고침
//            adapter.notifyDataSetChanged()

            // 스크롤 옮기기
            rv.smoothScrollToPosition(data.size - 1)

            // EditText 비우기
            edt_msg.text.clear()
        }
        myRef.addChildEventListener(ChildEvent(data, adapter))
    }
}