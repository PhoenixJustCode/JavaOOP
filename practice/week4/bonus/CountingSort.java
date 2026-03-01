

public class CountingSort {
    public static int[] sort(int[] array) {
        int max = 10;
        int[] count = new int[max + 1];
        for (int num : array) {
            if (num >= 0 && num <= max) count[num]++;
        }
        int[] sorted = new int[array.length];
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                sorted[index++] = i;
                count[i]--;
            }
        }
        return sorted;
    }
}
