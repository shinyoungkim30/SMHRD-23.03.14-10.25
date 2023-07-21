package 도서관리프로그램;

import java.util.ArrayList;

// 책을 관리하는 클래스(등록, 책정보 확인, 수정 등...)

public class BookSystem {
	
	private ArrayList<BookData> list = new ArrayList<>();
	
	// 책 등록 기능
	public void addBook(String title, int price, String Writer) {
		BookData book = new BookData(title, price, Writer);
		list.add(book);
	}
	
	// 책 전체 조회
	public String getBookTitleList() {
		String msg = "";
		for(int i=0; i<list.size(); i++) {
			BookData temp = list.get(i); // 책을 한권씩 꺼내는 코드
			msg += temp.getTitle(); // 책 이름을 누적
			msg += "\n";
					
		}
		
		return msg;
	}

}
