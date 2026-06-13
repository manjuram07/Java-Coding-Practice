import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

	public static void main(String[] args) {
		Integer[] arr = { 64, 25, 12, 22, 11 };
		int n = arr.length;
		
		sort(arr, n);

		List<Integer> arrayList = getArrayList(arr);
	        System.out.println(arrayList); // Debug this
	}

	private static List<Integer> getArrayList(Integer[] arr) {
		List<Integer> list = new ArrayList<>();
	        for (int num : arr) list.add(num);
	        return list;
	}

	static void sort(Integer[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

}
