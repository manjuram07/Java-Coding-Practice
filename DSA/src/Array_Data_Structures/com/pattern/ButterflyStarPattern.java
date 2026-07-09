package Array_Data_Structures.com.pattern;

public class ButterflyStarPattern {
    public static void main(String[] args) {

        int n = 4;

        for (int row=1; row<=n; row++){
            for (int col=1; col<=2*n; col++){
                if (col > row && col <= 2*n-row){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= 2 * n; j++) {

                // To print spaces
                if (j > i && j <= 2 * n - i) {
                    System.out.print(" ");
                }

                // To print stars
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
