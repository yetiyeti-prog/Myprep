package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneNumberToString {

    public static void main(String[] args) {
        String inputDigits = "23";
        List<String> mapping = Arrays.asList("0","1","abc","def","ghi","jkl","mno","pqrs","tvu","wxyz");
        List<String> result = new ArrayList<>();
        letterCombination(0,0,"", inputDigits, mapping, result);
        System.out.println("Result " + result);
    }

    private static void letterCombination(int count, int currentId, String current_str, String inputDigits, List<String> mapping, List<String> result) {
        System.out.println(count + " " + current_str);
        if (currentId == inputDigits.length()) {
            result.add(current_str);
            return;
        }
        String letters = mapping.get(Character.getNumericValue(inputDigits.charAt(currentId)));

        for (int i = 0; i < letters.length(); i++ ) {
            letterCombination(count++, currentId + 1,current_str + letters.charAt(i), inputDigits, mapping, result);
        }


    }
}
