package interview_preparation.coding_questions;

import java.util.HashMap;
import java.util.Map;

public class TwiceLetter {

    public static char twiceLetter(String string) {
        Map<Character, Integer> characterCountMap = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
           char currentChar = string.charAt(i);
           int currentCount = characterCountMap.getOrDefault(currentChar, 0);
           characterCountMap.put(currentChar, currentCount +1);

           if(characterCountMap.get(currentChar) == 2) {
               return string.charAt(i);
           }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "abcdd";
        System.out.println(twiceLetter(str));
    }
}
