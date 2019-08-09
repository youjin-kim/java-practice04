package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode = 1;
	

	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}



	public void print() {
		System.out.println(
			"책 제목:" + title +
			", 작가:" + author +
			", 대여 유무:" + ( stateCode == 1 ? "재고있음" : "대여중" ) );
	}



	public int getBookNo() {
		return bookNo;
	}



	public void rent() {
		System.out.println(title + "(가) 대여 됐습니다.");
		stateCode = 0;
	}
}