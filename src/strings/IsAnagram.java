package strings;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] alphabetTrack = new int[26];

        for (char alphabet : s.toCharArray()) {
            alphabetTrack[alphabet - 'a']++;
        }

        for (char alphabet : t.toCharArray()) {
            if (--alphabetTrack[alphabet - 'a'] < 0)
                return false;
        }
        return true;
    }
}
