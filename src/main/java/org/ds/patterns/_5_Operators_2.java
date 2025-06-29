package org.ds.patterns;

public class _5_Operators_2 {


    /*

       Q. Number of 1's of a binary number
       A.
       Input - 100000000000001
       Output - 2

     */


    public static void main(String[] args) {

        String n = "1000100000001";

        int count = 0;

        int i = 0;
        System.out.println(n);
        while (i<n.length()) {
            if (n.charAt(i)=='1') {
                count++;
            }
            i++;
        }
        System.out.println("Count " + count);

    }
}
