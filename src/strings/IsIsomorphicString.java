package strings;

import java.util.*;

public class IsIsomorphicString {
    private static String getSequence(String s) {
        HashMap<Character, Integer> id = new HashMap<>();
        int idCounter = 1;

        for (int i = 0; i < s.length(); i++) {
            if (!id.containsKey(s.charAt(i))) {
                id.put(s.charAt(i), idCounter);
                idCounter++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(id.get(s.charAt(i)));
            sb.append(" ");
        }

        return sb.toString();
    }
    public static boolean isIsomorphic(String s, String t) {
        s = getSequence(s);
        t = getSequence(t);

        return s.equals(t);
    }
}
