package org.ds.patterns;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _8_UniqueNumberInArray {


    public static void main(String[] args) {
        int[] input = {1,7,2,1,2,3,3,5,6};

        System.out.println("Input " + Arrays.toString(input));
        Map<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i < input.length; i++){

            if (map.get(input[i]) == null || !map.get(input[i])) {
                map.put(input[i], true);
            } else {
                map.put(input[i], false);
            }
        }

        long a = map.entrySet().stream()
                .filter(integerBooleanEntry -> Boolean.FALSE.equals(integerBooleanEntry.getValue()))
                .count();

        System.out.println("Output " + a);
    }
}
