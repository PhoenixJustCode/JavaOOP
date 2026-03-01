//cd D:\8.Java\practice\week4\bonus; javac *.java; java Main
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] data = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 10, 0};
        System.out.println("Unsorted: " + Arrays.toString(data));
        int[] sorted = CountingSort.sort(data);
        System.out.println("Sorted (0-10): " + Arrays.toString(sorted));
    }
}
