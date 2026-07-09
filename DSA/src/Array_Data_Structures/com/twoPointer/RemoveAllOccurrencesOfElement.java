package Array_Data_Structures.com.twoPointer;

public class RemoveAllOccurrencesOfElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int ele = 3;

        removeElement(arr, ele);
    }

    private static void removeElement(int[] arr, int ele) {
        int k = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != ele) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.println(k);
    }
}


