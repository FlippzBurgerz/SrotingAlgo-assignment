package algo.sorting;

import java.util.Arrays;

/**
 * Sort an array containing integers in ascending order
 * (arranged from smallest to largest) using the Drake sort algorithm.
 */
// tids komplexiteten är O(n) för metoden
public class DrakeSort implements Sort {

	public int[] sort(int[] unsorted) {
		if (null == unsorted || unsorted.length < 2) { // O(1)
			return unsorted; // inget att sortera
		}
		// hitta min värde och max värde, för att hitta intervallet av nummer vi har.
		int max = Arrays.stream(unsorted).max().orElse(Integer.MAX_VALUE); //stream tids komplexitet är beroende på filter, i detta fall är det en lista så då blir det O(n)
		int min = Arrays.stream(unsorted).min().orElse(0); //O(n)
		//antal element som den här arrayen ska ha, + 1 är för att kompensera för 0 index
		int[] countArray = new int[max - min + 1];

		for (int value : unsorted) { //O(n)
			countArray[value - min]++;
		}
		//arrayindex använder vi för att placera integers i index med start på index plats 0
		int arrayIndex = 0;
		//iterara genom listan där vi tar bort min, och lägger till +1 för att kompensera för index 0, vi subtraherar min för att komma åt nästa värde
		for (int i = 0; i < max - min + 1; i++) { //O(1)
			while (countArray[i] > 0) {
				unsorted[arrayIndex] = i + min;
				countArray[i]--;
				arrayIndex++;
			}
		}
		//TODO: Add implementation
		return unsorted;
	}
}