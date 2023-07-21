package 성적관리프로그램;

public class Simulator {

	public static void main(String[] args) {

		// stu1 객체 생성 -> 생성자 호출
		Student stu1 = new Student("황해도", "001", 90, 80, 87);
		// stu2 객체 생성
		Student stu2 = new Student("강예진", "002", 100, 100, 100);

//		stu1.stuName = "황해도";
//		stu1.stuNum = "001";
//		stu1.javaScore = 90;
//		stu1.dbScore = 80;
//		stu1.webScore = 87;
		
		System.out.println(stu1.getStuName());
		System.out.println(stu1.getStuNum());
		System.out.println(stu1.getJavaScore());
		
		// stu1 학번 수정
		stu1.setStuNum("002");
		System.out.println(stu1.getStuNum());
		
		
		
		

	}

}
