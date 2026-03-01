package users;

import java.io.Serializable;
import java.util.Vector;

import Book.Book;
import Book.State;

public class Librarian extends Employee implements Serializable{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Librarian() {
		
	}
	public Librarian(String fullName, String username, String password, int salary) {
		super(fullName, username, password, salary);
	}
	
	public boolean addBook(Book book) {
		if (Database.books.contains(book)) return false;
		Database.books.add(book);
		return true;
	}
	
	public boolean removeBook(Book book) {
		Database.books.remove(book);
		if (Database.books.contains(book)) {
			Database.books.remove(book);;
			return true;
		}
		return false;
	}
	public boolean receiveBook(Book book, Student student) {
		if(Database.studentBooks.containsKey(student)) {
			if (book.getState() == State.GOOD) {
				Database.books.add(book);
				Database.studentBooks.remove(book, student);
				return true;
			}
		}
		return false;
	}
	
	
	public static Vector<Book> getBooks() {
		return Database.books;
	}
	public static void setBooks(Vector<Book> books) {
		Database.books = books;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}