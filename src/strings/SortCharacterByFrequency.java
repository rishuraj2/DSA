package strings;

import java.util.*;

public class SortCharacterByFrequency {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> alphabetCountStore = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char alphabet = s.charAt(i);
            alphabetCountStore.compute(alphabet, (key, value) -> 
                value == null? 1 : value + 1
            );
        }

        s = "";

        for (int i = 0; i < alphabetCountStore.size(); i++) {
            int highestFrequency = 0;
            char highestFrequencyCharacter = '\0';
            for (Map.Entry<Character, Integer> entry : alphabetCountStore.entrySet()) {
                if (entry.getValue() > highestFrequency) {
                    highestFrequency = entry.getValue();
                    highestFrequencyCharacter = entry.getKey();
                }
            }
            for (int j = 0; j < highestFrequency; j++) {
                s = s + highestFrequencyCharacter;
            }
            alphabetCountStore.put(highestFrequencyCharacter, 0);
        }

        return s;
    }
}
