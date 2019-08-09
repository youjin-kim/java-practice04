package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	

	
	public void print() {
		System.out.println(
			"책 제목:" + title +
			", 작가:" + author +
			", 대여 유무:" + ( stateCode == 1 ? "재고있음" : "대여중" ) );
	}
}