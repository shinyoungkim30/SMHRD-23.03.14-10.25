package 숫자게임만들기;

import java.util.ArrayList;
import java.util.Random;

public class PlusGame implements OperatorGame {

	// 개발자1
	// 자연쌤이 주신 인터페이스를 사용해서 구현하기
	// 기능을 완성하기

	ArrayList<Quiz> list = new ArrayList<>();

	private int num1;
	private int num2;
	private int num3;
	private int num4;

	// 난수를 생성하는 기능
	@Override
	public int random() {

		Random rd = new Random();

		int num = rd.nextInt(5) + 1;

		return num;
	}

	// 문제를 제출할 수 있는 기능
	@Override
	public String getQuizMsg(int input) {

		num1 = random();
		num2 = random();
		num3 = random();
		num4 = random();

		list.add(new Quiz(num1 + " + " + num2 + " = ", num1 + num2));
		list.add(new Quiz(num1 + " + " + num2 + " * " + num3 + " = ", num1 + num2 * num3));
		list.add(new Quiz(num1 + " + (" + num2 + " * " + num3 + ") * " + num4 + " = ", num1 + (num2 * num3) * num4));
		list.add(new Quiz(num1 + " * " + num4 + " + " + num2 + " * " + num3 + " = ", num1 * num4 + num2 * num3));

		return list.get(input - 1).getQuiz();

	}

	// 정답을 체크할 수 있는 기능
	@Override
	public boolean checkAnswer(int ans) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAnswer() == ans) {
				return true;
			}
		}
		return false;

	}

}
