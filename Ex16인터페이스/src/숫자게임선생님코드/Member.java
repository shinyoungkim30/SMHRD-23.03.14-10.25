package 숫자게임선생님코드;

public class Member {

	private String nick;
	private String pw;

	public Member(String nick, String pw) {
		this.nick = nick;
		this.pw = pw;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
