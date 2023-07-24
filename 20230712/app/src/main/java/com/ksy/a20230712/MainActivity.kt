package com.ksy.a20230712

import android.app.SearchManager
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat

// Android 4대 컴포넌트 (구성요소)
// 1. Activity (xml + kt)
// - 페이지를 나타내는 단위
// - manifast.xml 파일에 등록 후 사용

// 2. Service (kt)
// - 백그라운드에서 동작 (App을 꺼도 실행)
// ex) 위젯, 내비, 알람, 음악어플

// 3. Broadcast Receiver (객체)
// - 핸드폰에서 일어나는 모든일을 감지
// ex) 문자도착, 전화오는거 감지(후후), 볼륨키 눌렀다, 흔들었다, 잠금화면 해제했다.

// 4. Content Provider (객체)
// - 어플끼리 데이터 전달
// ex) 카톡 <-> 연락처 동기화

// 이 모든걸 실행할 수 있게 하는 객체 -> Intent

class MainActivity : AppCompatActivity() {
    // iv_kakaopage 이미지뷰 찾기!
    lateinit var iv_kakaopage: ImageView
    lateinit var tv_googlekakao: TextView
    lateinit var tv_sms: TextView
    lateinit var tv_call: TextView
    lateinit var btn_next: Button
    lateinit var edt_email: EditText
    lateinit var edt_pw: EditText
    lateinit var members: HashMap<String, String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Java) members = new HashMap()
        members = HashMap()

        members.put("qwer", "qwer")
        members.put("qwer1", "qwer1")
        members.put("qwer2", "qwer2")
        members.put("qwer3", "qwer3")
        members.put("qwer4", "qwer4")

        iv_kakaopage = findViewById(R.id.iv_kakaopage)
        tv_googlekakao = findViewById(R.id.tv_googlekakao)
        tv_sms = findViewById(R.id.tv_sms)
        tv_call = findViewById(R.id.tv_call)
        btn_next = findViewById(R.id.btn_next)
        edt_email = findViewById(R.id.edt_email)
        edt_pw = findViewById(R.id.edt_pw)

        iv_kakaopage.setOnClickListener {
            // Intent
            // 카카오 웹페이지로 이동~
            // 1. intent 생성
            // Java) Intent it_kakao = new Intent(해야할 일(Action), 데이터(Uri))
            // Intent 생성할 때 매개변수 2개 들어감
            var it_kakao: Intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kakaocorp.com/page/"))

            // 2. intent 실행
            // 중요! startActivities(X)
            startActivity(it_kakao)
        }

        tv_googlekakao.setOnClickListener {
            // 1. Intent 생성
            var it: Intent = Intent(Intent.ACTION_WEB_SEARCH)
            // 2. putExtra 함수 사용, 데이터 담기
            it.putExtra(SearchManager.QUERY, "아구찜")
            // 3. Intent 실행!
            startActivity(it)
        }

        tv_sms.setOnClickListener {
            // 문자보내는 페이지까지 이동
            // 나중에 실제로 문자 보내야될 경우, 인증 등 -> 문자보내는 업체 사용해야함
            // 1. Intent 생성
            var it: Intent = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:010-6572-7001"))
            // 2. putExtra 함수 사용 문자 내용 작성
            it.putExtra("sms_body", "안녕!")
            // 3. Intent 실행
            startActivity(it)
        }

        tv_call.setOnClickListener {
            // Android에는 예민한 기능이 있음
            // 권한요청을 해서 사용자가 허용을 해야 수행할 수 있도록 Android가 설계해놨음

            // 1. 이미 권한을 승인하지 않았는지 검사
            // 2. 승인하지 않았다면 다이얼로그 띄움
            // 3. Manifest.xml 파일 열어서 permission 태그 추가
            if (ActivityCompat.checkSelfPermission(
                    applicationContext,
                    android.Manifest.permission.CALL_PHONE
                )
                != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    0
                )
            }
            // 1. Intent 생성 (Action, Data)
            var it: Intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:010-6572-7001"))
            // 2. Intent 실행
            startActivity(it)
        }

        btn_next.setOnClickListener {
            // 다른 Activity로 이동
            var it_next: Intent = Intent(this, SubActivity::class.java)

            // 1. id가 존재하는지
            var inputID: String = edt_email.text.toString()
            var inputPW: String = edt_pw.text.toString()

            if (members.containsKey(inputID)) {
                // 해당되는 key값이 있으면 true, 없으면 false
                if (members.get(inputID).equals(inputPW)) {
                    // members에 저장된 값중 inputID를 키값으로 하는 데이터가 inputPW와 같으면 true 다르면 false
                    it_next.putExtra("email", edt_email.text.toString())

                    startActivity(it_next)
                }
            } else {
                Toast.makeText(applicationContext, "존재하지 않는 id입니다", Toast.LENGTH_SHORT).show()
            }
            // Map VS List
            // 정렬해야됨 - List
            // 비교해야됨 - List
            // 반복해야됨(처음부터 끝까지 하나씩) - List

            // 뽑아내고 찾아야 할 때 - Map
        }
    }
}