package strings;

public class MaximumNestingDepth {
    public static int maxDepth(String s) {
        int maxNestingCount = 0;
        int currentNestingCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                currentNestingCount++;
            else if (s.charAt(i) == ')')
                currentNestingCount--;
            
            maxNestingCount = Math.max(maxNestingCount, currentNestingCount);
        }

        return maxNestingCount;
    }
}
