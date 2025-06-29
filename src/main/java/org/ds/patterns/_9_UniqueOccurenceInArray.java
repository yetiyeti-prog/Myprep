package org.ds.patterns;

import java.util.*;

public class _9_UniqueOccurenceInArray {


    public static void main(String[] args) {
        int[] input = {1,7,2,1,2,3,3,5,6,3,3,2};

        System.out.println("Input " + Arrays.toString(input));
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {

            if (map.get(input[i]) == null) {
                map.put(input[i], 1);
            } else {
                map.put(input[i], map.get(input[i]) + 1);
            }
        }

        int a = new HashSet<>(map.values()).size();

        System.out.println("Output " + a);
    }
}
