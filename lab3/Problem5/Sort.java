package Problem5;

public class Sort{
	static <E> void swap(E []array, int i, int j) {
		E e1 = array[i-1];
		array[i-1] = array[i];
		array[i]=e1;
	}
	
	static <E extends Comparable<E> > void bubbleSort(E [] array) {
		for(int i=array.length; i>1; i++) {
			for(int j=1; j<array.length; j++) {
				if(array[j-1].compareTo(array[j]) == 1) {
					swap(array, j, j-1);
				}
			}
		}
	}
	

	static <E extends Comparable<E> > void mergeSort(E[] array, int l, int r) {
	        // base case
	        if (l < r){
	            int mid = (l + r) / 2;
	
	            mergeSort(array, l, mid); 
	            mergeSort(array, mid + 1, r); 
	            
	            merge(array, l, mid, r);
	        }
	    }
	
	 @SuppressWarnings("unchecked")
	 static <E extends Comparable<E> > void merge(E[] array, int l, int mid, int r)
	    {
	        E[] leftArray  = (E[]) new Comparable[mid - l + 1];
	        E[] rightArray = (E[]) new Comparable[r - mid];
	
	        for (int i = 0; i < leftArray.length; ++i)
	        	leftArray[i] = array[l + i];
	        for (int i = 0; i < rightArray.length; ++i)
	            rightArray[i] = array[mid + 1 + i];
	
	        int leftIndex = 0, rightIndex = 0;
	
	        int currentIndex = l;
	
	        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
	            if ((leftArray[leftIndex]).compareTo(rightArray[rightIndex]) <= 0) {
	                array[currentIndex] = leftArray[leftIndex];
	                leftIndex++;
	            }
	            else {
	                array[currentIndex] = rightArray[rightIndex];
	                rightIndex++;
	            }
	            currentIndex++;
	        }
	
	        while (leftIndex < leftArray.length) array[currentIndex++] = leftArray[leftIndex++];
	
	        while (rightIndex < rightArray.length) array[currentIndex++] = rightArray[rightIndex++];
	    }
}
