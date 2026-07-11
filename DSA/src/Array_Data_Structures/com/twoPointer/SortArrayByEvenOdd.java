package Array_Data_Structures.com.twoPointer;

public class SortArrayByEvenOdd {

    public static void main(String[] args) {

        int[] a = {3,1,2,4,5,9,8};

        int i=0, j=0;

        while (i<a.length){
            if (a[i]%2 != 0){
                i++;
            } else if(a[i]%2 == 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
                i++;
            }
        }

        for (int num : a){
            System.out.print(num+" ");
        }
    }
}
