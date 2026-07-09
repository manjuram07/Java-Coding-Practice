package Array_Data_Structures.com.pattern;

public class Pyramid {

    public static void main(String[] args) {

        rightHalfPyramid(4);
        System.out.println("----------------------");
        reverseRightHalfPyramid(5);
        System.out.println("----------------------");
        leftHalfPyramid(5);
        System.out.println("----------------------");
        numberChangingPyramid(4, 1);
        System.out.println("----------------------");
        numberIncreaseReversePyramid(4);
    }

    private static void numberIncreaseReversePyramid(int n) {
        for (int row=1; row<=n; row++){
            for (int col=1; col<=n-row+1 ; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    private static void numberChangingPyramid(int n, int num) {
        for (int row=1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    private static void leftHalfPyramid(int n) {

        for (int row=1; row<=n; row++){
            for (int space=1; space<=n-row+1; space++){
                System.out.print(" ");
            }
            for (int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void reverseRightHalfPyramid(int n) {

        for (int row=1; row<=n; row++){
            for (int col=1; col<=(n-row+1); col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void rightHalfPyramid(int n) {

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
