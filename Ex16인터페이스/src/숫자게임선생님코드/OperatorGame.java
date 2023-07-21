package 숫자게임선생님코드;

public interface OperatorGame {
	
	// 난수를 생성하는 기능
		public abstract int random();

		// 문제를 제출할 수 있는 기능
		public abstract String getQuizMsg();

		// 정답을 체크할 수 있는 기능
		public abstract boolean checkAnswer(int ans);

}
