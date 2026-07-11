package Array_Data_Structures.com.twoPointer;

public class DuplicateZeros {

    static void main(String[] args) {

        int[] a = {1,2,3};
        int[] res = new int[a.length];
        int k=0;

        for (int i=0; i<a.length; i++){
            if (a[i] == 0){
                res[k++] = 0;

                if (k < a.length){
                    res[k++] = 0;
                }

            } else {
                res[k++] = a[i];
            }
        }

        for (int num : res){
            System.out.print(num+" ");
        }
    }
}
