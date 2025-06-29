package org.ds.patterns;

import java.util.Arrays;

public class _7_SwapAlternateArrays {


    public static void main(String[] args) {
        int[] input = {1,2,4,5,7};

        System.out.println("Input " + Arrays.toString(input));
        for (int i = 0; i < input.length; i++){
            if (i % 2 != 0) {
                int temp = input[i];
                input[i] = input[i-1];
                input[i-1]=temp;
            }
        }
        System.out.println("Output " + Arrays.toString(input));
    }
}
