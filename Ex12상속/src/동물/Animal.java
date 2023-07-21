package 동물;

public abstract class Animal {
	
	// 추상 키워드 : abstract
	// 추상 메서드를 포함하려면 추상 클래스로 바뀌어야함
	// 추상 메서드를 포함하고 있지 않아도 추상 클래스가 될 수 있음
	// 추상메서드는 설계만되어있다 (선언만 되어있다)
	// {body}가 없는 메서드를 보고 추상 메서드
	// 접근제한자, 리턴타입, 메서드명, 매개변수 만 정해져 있는 메서드

	// 동물 Class
	
	// 먹다 eat()
	public abstract void eat();

	// 자다 sleep()
	public abstract void sleep();

	// 움직이다 move()
	public abstract void move();

}
