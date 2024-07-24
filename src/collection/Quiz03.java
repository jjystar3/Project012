package collection;

import java.util.ArrayList;

public class Quiz03 {

	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<>();

		list.add(new Book(100, "JAVA"));
		list.add(new Book(200, "CSS"));
		list.add(new Book(300, "HTML"));

		for (Book book : list) {
			System.out.println(book);
		}

//		list.removeAll(list);
		list.clear();
		
	}

}

class Book {
	int bookNum;
	String bookName;

	public Book(int bookNum, String bookName) {
		this.bookNum = bookNum;
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", bookName=" + bookName + "]";
	}

}