package 쓰레드활용;

import java.awt.Toolkit;

public class ThreadSleepMain {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 삐~소리 사용하기 위함

		for (int i = 1; i <= 10; i++) {
			toolkit.beep();
			System.out.println("3초 후에 beep음 울림!");

			// try~catch : 예외처리 -> 런타임오류(실행오류)
			try { // 내가 실행하고 싶은 코드
				Thread.sleep(3000); // 1000ms -> 1s
			} catch (Exception e) { // Exception : 모든 예외상황 처리 가능
				// try문 실행 시 예외상황이 발생하면 catch 블록 호출
				e.printStackTrace();
				// printStackTrace : 발생한 예외상황의 이유를 절차적으로 출력
			}
//			catch(IndexOutOfBoundsException e) {
//				catch문 여러개 사용가능
//			}
		}

	}

}
