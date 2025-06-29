package org.ds.patterns;

public class _4_Operators_1 {


    /*

       Q. subtract the product and sum of the digits of an integer
       A.
       Input - 234
       Output - 15
       Product = 2 * 3 * 4 = 24
       Sum = 2 + 3 + 4 = 9
       Diff = 24 - 9 = 15

     */


    public static void main(String[] args) {

        int n = 334;
        int length = String.valueOf(n).length();

        int product = 1;
        int sum = 0;
        for (int i = 1; i <= length; i++) {
            int digit = n%10;
            product = product * digit;
            sum = sum + digit;
            n=n/10;
        }
        System.out.println("Product " + product);
        System.out.println("Sum " + sum);
        int diff = product - sum;
        System.out.println("Diff " + diff);
    }
}
