package strings;

public class Atoi {
    public static int myAtoi(String s) {
        if (s == null || s.isEmpty())
            return 0;

        s = s.trim();

        if (s.isEmpty())
            return 0;

        long result = 0;

        boolean isNegative = s.charAt(0) == '-';
        boolean isPositive = s.charAt(0) == '+';

        int i = isNegative? 1 : isPositive? 1 : 0;

        while (i < s.length()) {
            char symbol = s.charAt(i);

            if (symbol < '0' || symbol > '9')
                break;
            else if (symbol >= '1' && symbol <= '9') {
                result = (result * 10) + (symbol - '0');
            } else if (result != 0 && symbol == '0') {
                result = (result * 10) + (symbol - '0');
            }

            if (result > Integer.MAX_VALUE) {
                if (isNegative)
                    return Integer.MIN_VALUE;

                return Integer.MAX_VALUE;
            }

            i++;
        }

        result = isNegative? -result : result;

        return (int) result;
    }
}
