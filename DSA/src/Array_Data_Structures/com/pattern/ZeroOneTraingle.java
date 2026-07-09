package Array_Data_Structures.com.pattern;

public class ZeroOneTraingle {
    public static void main(String[] args) {

        int n = 4;

        for (int row=1; row<=n; row++){
            for (int col=1; col<=row; col++){
                if ((row+col) % 2 == 0){
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}

/*
            1
            0 1
            1 0 1
            0 1 0 1
 */
