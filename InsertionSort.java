package algo.sorting;

/**
 * Sort an array containing integers in ascending order
 * using the insertion sort algorithm.
 */
//metoden har tids komplexiteten O(n^2) för den ökar kvadratiskt gentemot n
public class InsertionSort implements Sort {

	public int[] sort(int[] unsorted) {
		for (int i = 1; i < unsorted.length; ++i) { //O(n)
			int element = unsorted[i]; //O(n)
			int j = i - 1;

			while ( j >= 0 && unsorted[j] > element) { //O(n)
				unsorted[j + 1] = unsorted[j];
				j--;
			}
			unsorted[j+1] = element;
		}
		//TODO: Add implementation
		return unsorted;
	}	
}