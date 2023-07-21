package 숫자게임선생님코드;

import java.util.Random;

public class PlusGame implements OperatorGame {

	Random rd = new Random();

	int num1 = 0;
	int num2 = 0;

	@Override
	public int random() {

		return rd.nextInt(50) + 1;
	}

	@Override
	public String getQuizMsg() {

		int num1 = random();
		int num2 = random();

		return num1 + " + " + num2 + " = ";
	}

	@Override
	public boolean checkAnswer(int ans) {

		if (num1 + num2 == ans) {
			return true;
		} else {
			return false;
		}

	}

}
