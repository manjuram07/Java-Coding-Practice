package Array_Data_Structures.com.twoPointer;

public class MoveAllZerosToEnd {


    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int k = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }

        for (int num : arr){
            System.out.print(num+" ");
        }
    }
}