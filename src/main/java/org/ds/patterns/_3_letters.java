package org.ds.patterns;

public class _3_letters {


    /*
     ABC
     BCD
     CDE
     */

    public static void main(String[] args) {


        int n = 3;

        int row = 1;
        while (row<=n) {

            // for stars
            int col = 1;
            while (col <= n) {
                int a = 'A' + row + col - 2;
                char b = (char) a;
                System.out.print(b);
                col++;
            }
            System.out.println();
            row ++;
        }

    }
}
