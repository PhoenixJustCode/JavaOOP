package demo;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import Book.Book;
import Book.State;
import course.Course;
import course.CourseFile;
import course.Period;
import mark.AttestationType;
import other.Message;
import other.News;
import users.Database;
import users.Employee;
import users.FacultyType;
import users.Librarian;
import users.Manager;
import users.Student;
import users.Teacher;
import users.User;

public class LibrarianDemo {
	static Librarian librarian = null;
	static BufferedReader br = null;
	private static void addBook() throws IOException {
		String bookAuthor;
		String bookName;
		String bookID;
		State state=null;
		
		System.out.println("Enter book Author: ");
		bookAuthor = br.readLine();
		
		System.out.println("Enter book name: ");
		bookName = br.readLine();
		
		System.out.println("Enter book ID: ");
		bookID = br.readLine();
		
		if(librarian.addBook(new Book(bookAuthor, bookName, bookID, state)));
			System.out.println("Book is successfully added!");
	}
	
	private static void removeBook() throws IOException {
		System.out.println("Enter book ID: ");
		String bookID = br.readLine();
		
		for (Book b : Database.books) {
			if (b.getBookID().equals(bookID)) {
				if (librarian.removeBook(b));
					System.out.println("Book is successfully removed!");
			}
		}
		System.out.println("Book is not in the Database!");
	}
	
	private static void receiveBook() throws IOException {
		System.out.println("Enter book name: ");
		String bookName = br.readLine();
		
		System.out.println("Enter student's name: ");
		String name = br.readLine();
		
		for (Book b : Database.books) {
			if (b.getBookName().equals(bookName)) {
				for (Student s : Database.students) {
					if (s.getFullName().equals(name)) {
						if (librarian.receiveBook(b, s));
							System.out.println("Book is received");
					}
				}
				
			}
		}
		System.out.println("Error");
	}
	
	private static void exit() {
		Database.save();
		System.out.println("Bye bye");
	}
	
	public static void run(User user) {
		librarian = (Librarian)user;
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			menu: while(true) {
				System.out.println("What do you want to do?\n 1) Manage book \n 2) receive book  \n 3) Logout");
				int choice = Integer.parseInt(br.readLine());
				if (choice == 1) {
					System.out.println("What do you want to do?\n - add book \n - remove book");
					String operation = br.readLine();
					if (operation.equals("add book")) {
						addBook: while(true) {
							addBook();
							System.out.println("\n 1) Add another book  \n 2) Return back \n 3) Exit");
							choice = Integer.parseInt(br.readLine());
							if(choice == 1) continue addBook;
							if(choice == 2) continue menu;
							if(choice == 3) {
								exit();  
								break menu;
							}
							break;
						}
					}
					else if (operation.equals("remove news")) {
						removeBook: while(true) {
							removeBook();
							System.out.println("\n 1) Remove another book  \n 2) Return back \n 3) Exit");
							choice = Integer.parseInt(br.readLine());
							if(choice == 1) continue removeBook;
							if(choice == 2) continue menu;
							if(choice == 3) {
								exit();  
								break menu;
							}
							break;
						}
					}
				}
				else if (choice == 2) {
					receiveBook();
					System.out.println("Enter book name: ");
					String bookName = br.readLine();
					
					System.out.println("Enter student's name: ");
					String name = br.readLine();
					for (Book b : Database.books) {
						if (b.getBookName().equals(bookName)) {
							for (Student s : Database.students) {
								if (s.getFullName().equals(name)) {
									System.out.println(librarian.receiveBook(b, s));
								}
							}
						}
					}
					System.out.println("\n 1) Return back \n 2) Exit");
					choice = Integer.parseInt(br.readLine());
					if(choice == 1) continue menu;
					if(choice == 2) {
						exit();  
						break menu;
					}
				}
				else {
					exit();
					break menu;
				}
			}
		}
		catch(Exception e) {
			System.out.println("Something bad happened... \n Saving resources...");
			e.printStackTrace();
		}
	}
	
}
