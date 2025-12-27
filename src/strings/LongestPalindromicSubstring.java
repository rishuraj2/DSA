package strings;

public class LongestPalindromicSubstring {
    private static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }

    public static String longestPailindrome(String s) {
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j <= s.length() - i; j++) {
                if (isPalindrome(s.substring(j, j+i))) {
                    return s.substring(j, j+i);
                }
            }
        }
        return String.valueOf(s.charAt(0));
    } 
}
