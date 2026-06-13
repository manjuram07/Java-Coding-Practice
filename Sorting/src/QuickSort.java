import java.util.ArrayList;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = { 4, 1, 3, 9, 7 };
		// sort the array
		quickSort(arr, 0, arr.length - 1);
		System.out.println("After sorting array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static void quickSort(int[] arr, int low, int high) {

		// i is the start index and j is the end index
		if (low < high) {
			// p is the partition
			int pivotIndex = partition(arr, low, high);

			// recursively sort the left and right
			// p-1 is the index of the pivot element
			// so we start from low to p-1
			quickSort(arr, low, pivotIndex - 1);

			// p+1 is the index of the pivot element
			// so we start from p+1 to high
			// to sort the right side of the pivot element
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {

		// element at j is pivot
		int pivot = arr[high];

		// pIndex is the index of the pivot element
		int pIndex = low;

		for (int k = low; k < high; k++) {
			if (arr[k] < pivot) {
				// swap the element at k with the element at pIndex
				swap(arr, k, pIndex);
				pIndex++;
			}
		}
		// swap the pivot element with the element at pIndex
		swap(arr, high, pIndex);

		// return the index of the pivot element
		System.out.println(arr[pIndex]);
		return pIndex;
	}

	private static void swap(int[] arr, int k, int pIndex) {
		int temp = arr[k];
		arr[k] = arr[pIndex];
		arr[pIndex] = temp;
	}

}
