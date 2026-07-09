package Array_Data_Structures.com.pattern;

public class PalindromeTraingle {
    public static void main(String[] args) {

        int n = 4;

        for (int row=1; row<=n; row++){
            for (int space=1; space<= 2*(n-row); space++){
                System.out.print(" ");
            }

            for (int col=row; col>=1; col--){
                System.out.print(col+" ");
            }

            for (int col=2; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

/*
              1
            2 1 2
          3 2 1 2 3
        4 3 2 1 2 3 4
 */