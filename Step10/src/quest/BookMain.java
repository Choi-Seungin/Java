package quest;

import java.util.ArrayList;

public class BookMain {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();
		
		list.add(new Book("책제목", "김철수"));
		list.add(new Book("책제목1", "김철수"));
		list.add(new Book("책제목2", "김철수"));
		
		System.out.println(list.get(1).equals(list.get(2)));
	}
	

}
