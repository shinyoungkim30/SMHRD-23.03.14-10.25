package com.ksy.ex230720

import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError

class ChildEvent(var data: ArrayList<KakaoVO>, var adapter: KakaoAdapter) : ChildEventListener {
    override fun onChildAdded(snapshot: DataSnapshot, previousChildName: String?) {
        // snapshot => firebase database에 저장된 데이터
        // json구조 응답 => KakaoVO 형태로 변환
        var temp: KakaoVO? = snapshot.getValue(KakaoVO::class.java)

        data.add(temp!!) // temp가 null일수도 있음을 표기

        adapter.notifyDataSetChanged()
    }

    override fun onChildChanged(snapshot: DataSnapshot, previousChildName: String?) {

    }

    override fun onChildRemoved(snapshot: DataSnapshot) {

    }

    override fun onChildMoved(snapshot: DataSnapshot, previousChildName: String?) {

    }

    override fun onCancelled(error: DatabaseError) {

    }
}