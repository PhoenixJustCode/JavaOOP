// Run: javac lab2/problem1/library/*.java && java lab2.problem1.library.LibraryTest
package lab2.problem1.library;

public class LibraryTest {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 2017, 412);
        System.out.println(book);
    }
}
