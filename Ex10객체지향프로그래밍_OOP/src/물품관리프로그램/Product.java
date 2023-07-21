package 물품관리프로그램;

public class Product {

	// 필드
	private String name;
	private int unitPrice;
	private int amount;

	// 메서드
	
	// 생성자
	// 1) 생성자도 메서스다
	// 2) 생성자 이름이 클래스명과 같다 (대소문자 구분)
	// 3) 생성자는 리턴타입이 없다 (void X)
	// 4) 기본생성자는 생략되어 있다
	// 새로운 생성자를 만들게 되면 기본생성자는 기능을 잃는다
	// 기본생성자도 사용하고 싶으면 코드로 작성해줘야 한다 (생략X)
	public Product(String name, int unitPrice, int amount) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}

	// getter : private 감싸진 필드를 열어서 확인할 수 있도록 해주는 메서드

	public String getName() {
		return name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public int getAmount() {
		return amount;
	}

}
