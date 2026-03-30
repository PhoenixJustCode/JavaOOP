package lab3.Problem5;

public class Sort {

	static <E> void swap(E[] array, int i, int j) {
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	static <E extends Comparable<E>> void bubbleSort(E[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					swap(array, j, j + 1);
				}
			}
		}
	}

	static <E extends Comparable<E>> void mergeSort(E[] array) {
		mergeSortHelper(array, 0, array.length - 1);
	}

	private static <E extends Comparable<E>> void mergeSortHelper(E[] array, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			mergeSortHelper(array, l, mid);
			mergeSortHelper(array, mid + 1, r);
			merge(array, l, mid, r);
		}
	}

	@SuppressWarnings("unchecked")
	private static <E extends Comparable<E>> void merge(E[] array, int l, int mid, int r) {
		E[] left = (E[]) new Comparable[mid - l + 1];
		E[] right = (E[]) new Comparable[r - mid];

		for (int i = 0; i < left.length; i++)
			left[i] = array[l + i];
		for (int i = 0; i < right.length; i++)
			right[i] = array[mid + 1 + i];

		int i = 0, j = 0, k = l;

		while (i < left.length && j < right.length) {
			if (left[i].compareTo(right[j]) <= 0) {
				array[k++] = left[i++];
			} else {
				array[k++] = right[j++];
			}
		}

		while (i < left.length) array[k++] = left[i++];
		while (j < right.length) array[k++] = right[j++];
	}
}
