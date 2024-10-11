package quest;

public class Book {
	
	private String bookName;
	private String author;
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if(obj instanceof Book) {
			Book temp = (Book)obj;
			return bookName.equals(temp.bookName) && author.equals(temp.author);
		}
		return false;
	}

}
