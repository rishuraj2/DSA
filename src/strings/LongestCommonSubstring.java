package strings;

public class LongestCommonSubstring {
    public static String longestCommonSubstring(String[] strs) {
        String smallestWord = strs[0];
        for (String word : strs) {
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
        }

        int smallestWordLength = smallestWord.length();
        for (int i = smallestWordLength; i > 0; i--) {
            for (int j = 0; j <= smallestWordLength - i; j++) {
                String subString = smallestWord.substring(j, j+i);
                boolean contains = true;
                for (String k : strs) {
                    if (!k.contains(subString)) {
                        contains = false;
                        break;
                    }
                }

                if (contains) {
                    return subString;
                }
            }
        }

        return "";
    }
}
