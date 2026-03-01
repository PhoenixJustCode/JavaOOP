package Book;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String bookAuthor;
	private String bookName;
	private String bookID;
	private State state;
	
	public Book() {
		
	}
	public Book(String bookAuthor, String bookName, String bookID, State state) {
		this.bookAuthor = bookAuthor;
		this.bookName = bookName;
		this.bookID = bookID;
		this.state = state;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Book [bookAuthor=" + bookAuthor + ", bookName=" + bookName + ", bookID=" + bookID + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookAuthor, bookID, bookName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookAuthor, other.bookAuthor) && Objects.equals(bookID, other.bookID)
				&& Objects.equals(bookName, other.bookName);
	}	
	
}

