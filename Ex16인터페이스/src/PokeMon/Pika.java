package PokeMon;

public class Pika implements PokeMon, DigiMon {

	// 인터페이스를 상속 : implements(구현하다)
	
	// 인터페이스는 다중 상속이 가능하다

	@Override
	public void atk() {

		System.out.println("주먹날리기");

	}

	@Override
	public void specialAtk() {

		System.out.println("백만볼트~");

	}

}
