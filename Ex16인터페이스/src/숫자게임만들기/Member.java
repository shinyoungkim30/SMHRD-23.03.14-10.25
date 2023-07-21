package 숫자게임만들기;

public class Member {
   
   //필드
   String nickName;
   String pw;
   
   //Member 클래스 메서드 : getter /setter , 생성자(필드 초기화 가능하도록)
   public Member(String nickName, String pw) {
      this.nickName = nickName;
      this.pw = pw;
   }

   public String getNickName() {
      return nickName;
   }

   public void setNickName(String nickName) {
      this.nickName = nickName;
   }

   public String getPw() {
      return pw;
   }

   public void setPw(String pw) {
      this.pw = pw;
   }
   
   
}