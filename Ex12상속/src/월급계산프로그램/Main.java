package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {

		RegularEmployee regular = new RegularEmployee("SMHRD001", "홍길동", 4000, 400);

		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay() + "만원");

		TempEmployee temp = new TempEmployee("SMHRD002", "박문수", 3000);

		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay() + "만원");

		PartTimeEmployee partTime = new PartTimeEmployee("SMHRD003", "임성훈", 10, 10);
		
		System.out.println(partTime.print());
		System.out.println(partTime.getMoneyPay() + "만원");
	}

}
