package 도서관리프로그램;

// 책을 표현하는 클래스(책 정보를 가지고 있음)

public class BookData {

	private String title;
	private int price;
	private String writer;
	
	// 생성자 - source - generate constructor using fields
	public BookData(String title, int price, String writer) {
		this.title = title;
		this.price = price;
		this.writer = writer;
	}
	
	// getter
	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public String getWriter() {
		return writer;
	}
	
	 
	

	
	

//	private String title;
//	private int price;
//	private String writer;
//
//	public BookData(String title, int price, String writer) {
//		this.title = title;
//		this.price = price;
//		this.writer = writer;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public String getWriter() {
//		return writer;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	public void setWriter(String writer) {
//		this.writer = writer;
//	}

}
