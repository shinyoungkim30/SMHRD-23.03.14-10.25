package 월급계산프로그램;

public class PartTimeEmployee extends Employee {

	int workDay;

	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay); // 부모클래의 생성자를 지칭하는 키워드
		this.workDay = workDay;
	}

	@Override
	public int getMoneyPay() {
		return pay * workDay;
	}

}
