package org.ds.stars;

public class _2 {


    /*
    ****1****
    ***212***
    **32123**
    *4321234*
    543212345
     */

    public static void main(String[] args) {


        int n = 5;

        int row = 1;
        while (row<=n) {

            // for stars
            int col = n-row;
            while (col != 0) {
                System.out.print("*");
                col--;
            }

            // for numbers triangle 1
            int col1 = row-1+1;
            while (col1 != 0) {
                System.out.print(col1);
                col1--;
            }

            // for numbers triangle 2
            int col2 = 2;
            while (row != 1 && col2 != row+1) {
                System.out.print(col2);
                col2++;
            }

            // for stars
            int col3 = n-row;
            while (col3 != 0) {
                System.out.print("*");
                col3--;
            }

            System.out.println();
            row ++;
        }

    }
}
