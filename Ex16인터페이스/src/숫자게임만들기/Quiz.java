package 숫자게임만들기;

public class Quiz {
	
	private String quiz;
	private int answer;
	
	public Quiz(String quiz, int answer) {
		this.quiz=quiz;
		this.answer=answer;
	}
	
	public String getQuiz() {
		return quiz;
	}
	
	public int getAnswer() {
		return answer;
	}

}
