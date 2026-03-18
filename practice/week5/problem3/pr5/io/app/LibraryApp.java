// How to run:
// cd practice/week5/problem3
// javac pr5/io/model/Book.java pr5/io/app/LibraryApp.java
// java pr5.io.app.LibraryApp

package pr5.io.app;

import pr5.io.model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    private static final String FILE_NAME = "library.dat";

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Book> books = loadBooks();
        Scanner scan = new Scanner(System.in);

        System.out.println("Library Manager");
        System.out.println("Commands: (A)dd, (L)ist, (Q)uit");

        while (true) {
            System.out.print("\n> ");
            String command = scan.nextLine().trim().toUpperCase();

            switch (command) {
                case "A":
                    System.out.print("Enter title: ");
                    String title = scan.nextLine().trim();
                    System.out.print("Enter author: ");
                    String author = scan.nextLine().trim();
                    books.add(new Book(title, author));
                    System.out.println("Book added.");
                    break;
                case "L":
                    if (books.isEmpty()) {
                        System.out.println("No books in library.");
                    } else {
                        for (int i = 0; i < books.size(); i++) {
                            books.get(i).incrementVisitCount();
                            System.out.println((i + 1) + ". " + books.get(i));
                        }
                    }
                    break;
                case "Q":
                    saveBooks(books);
                    System.out.println("Library saved. Goodbye!");
                    scan.close();
                    return;
                default:
                    System.out.println("Unknown command. Use A, L, or Q.");
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static ArrayList<Book> loadBooks() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("No existing library found. Starting fresh.");
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            ArrayList<Book> books = (ArrayList<Book>) ois.readObject();
            System.out.println("Loaded " + books.size() + " book(s) from " + FILE_NAME);
            System.out.println("(Note: visitCount is transient and resets to 0 after reload)");
            return books;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading library: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    private static void saveBooks(ArrayList<Book> books) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(books);
        } catch (IOException e) {
            System.out.println("Error saving library: " + e.getMessage());
        }
    }
}
