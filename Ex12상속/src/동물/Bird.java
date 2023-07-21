package 동물;

public abstract class Bird extends Animal {
	
	// 추상클래스를 상속받으면
	// 추상클래스 안에 있는 추상메서드를 반드시 구현해야 한다.

	// 조류
	// eat, sleep, move
//	public void eat() {
//		System.out.println("우걱우걱 먹다!");
//	}
//
//	public void sleep() {
//		System.out.println("쿨쿨 잔다!");
//	}

	// 오버라이딩
	// 상속 관계에서 메서드를 구현단{}만 다르게 작성
	// {} : body
//	public void move() {
//		System.out.println("날개로 날아다닌다!");
//	}
	
	// 조류의 move는 날개로 날아다녀야 됨
	
	// @ : annotation(어노테이션)
//	@Override
//	public void move() {
//		System.out.println("날개로 날아다닌다!");
//	}
	

}
