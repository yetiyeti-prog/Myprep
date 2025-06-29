package org.ds.patterns;

public class _6_ReverseInteger {


    /*

    Q. Reverse an integer
    A.
    Input - 4312
    Output - 2134

     */

    public static void main(String[] args) {

        int input = 112;
        int a = input;
        int result = 0;
        while (a!=0) {
            int remainder=a%10;
            result = result * 10 + remainder;
            System.out.println(remainder + "rrr" + result);
            a=a/10;
        }
        System.out.println(input);
        System.out.println(result);

    }
}
