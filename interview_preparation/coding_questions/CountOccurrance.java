package interview_preparation.coding_questions;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrance {
    public static Map<Character, Integer> countOccurance(String string) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            if (characterIntegerMap.get(string.charAt(i)) == null) {
                characterIntegerMap.put(string.charAt(i), 1);
            } else {
                int value = characterIntegerMap.get(string.charAt(i));
                characterIntegerMap.put(string.charAt(i), value + 1);
            }
        }
        return characterIntegerMap;
    }

    public static void main(String[] args) {
        String str = "aabbcccdd";
        System.out.println(countOccurance(str));
    }
}
