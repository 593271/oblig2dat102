package Oving5;

import java.util.Arrays;
import java.util.Random;

public class Sortering {

	public static void sel_sort(int numArray[]) {
		int n = numArray.length;

		// traverse unsorted array
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (numArray[j] < numArray[min_idx])
					min_idx = j;

			// swap minimum element with compared element
			int temp = numArray[min_idx];
			numArray[min_idx] = numArray[i];
			numArray[i] = temp;

		}
	}

	public static void insertionSort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

	public static void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	public static void MergeSort(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = l + (r - l) / 2;

			// Sort first and second halves
			MergeSort(arr, l, m);
			MergeSort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	public static void quickSort(int arr[], int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);

			quickSort(arr, begin, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	private static int partition(int arr[], int begin, int end) {
		int pivot = arr[end];
		int i = (begin - 1);

		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;

				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}

		int swapTemp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = swapTemp;

		return i + 1;
	}
	
	public static void kvikkSortNy(int[] data, int min, int maks) {
			final int MIN = 10;
			int posPartisjon;
			if (maks - min + 1 > MIN) {//antall elementer > MIN ?
			posPartisjon = partition(data, min, maks);
			kvikkSortNy(data, min, posPartisjon - 1);
			kvikkSortNy(data, posPartisjon + 1, maks);
			} 
			}
										
			
			
	
	public static  void kvikkSortNy(int[] data) {
		kvikkSortNy(data, 0, data.length - 1);
		insertionSort(data);
		} 


	public static int[] gigaArray(int startverdi) {

		Random tilfeldig = new Random();
		int[] tabell = new int[startverdi];

		for (int i = 0; i < startverdi; i++) {
			tabell[i] = tilfeldig.nextInt(10);
			//System.out.println(tabell[i]);
		}

		return tabell;
	}

	public static void main(String[] args) {
//		int[] tab = { 5, 3, 6, 2, 9, 10 };
//		int[] likTabell = {6,6,6,6,6,6,6,6,6};

		// fletteSort(tab2,0,tab2.length-1);

//		System.out.println(Arrays.toString(tab));
//		sel_sort(tab);
//		System.out.println(Arrays.toString(tab));

//		System.out.println(Arrays.toString(tab));
//		insertionSort(tab);
//		System.out.println(Arrays.toString(tab));

//		System.out.println(Arrays.toString(tab));
//		bubbleSort(tab);
//		System.out.println(Arrays.toString(tab));

//		System.out.println(Arrays.toString(tab));
//		MergeSort(tab,0 ,tab.length-1);
//		System.out.println(Arrays.toString(tab));

//		System.out.println(Arrays.toString(tab));
//		quickSort(tab,0 ,tab.length-1);
//		System.out.println(Arrays.toString(tab));

		// gigaArray(32000);
		
		

		long start = System.nanoTime() ;
		int fastArray[] = gigaArray(40);

		System.out.println(Arrays.toString(fastArray));                
		kvikkSortNy(fastArray);
		System.out.println(Arrays.toString(fastArray));

		long bruktTid = System.nanoTime() - start;
		System.out.println(bruktTid + " nanosekunder brukt i kvikksort");
		System.out.println();
		

		
//		int fastArray2[] = gigaArray(1000);
//		long start2 = System.nanoTime() ;
//
//		System.out.println(Arrays.toString(fastArray2));                
//		quickSort(fastArray2,0,fastArray2.length-1);
//		System.out.println(Arrays.toString(fastArray2));
//
//		long bruktTid2 = System.nanoTime() - start2;
//		System.out.println(bruktTid2 + " nanosekunder");
//		System.out.println();

	}

}
