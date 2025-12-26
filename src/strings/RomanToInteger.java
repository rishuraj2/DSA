package strings;

public class RomanToInteger {
    private static int integerEquivalent(char roman) {
        return switch(roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
    public static int romanToInteger(String s) {
        int result = integerEquivalent(s.charAt(s.length() - 1));

        for (int i = s.length() - 2 ; i >= 0; i--) {
            int numberCurrent = integerEquivalent(s.charAt(i));
            int numberAfter = integerEquivalent(s.charAt(i+1));

            if (numberCurrent >= numberAfter) {
                result += numberCurrent;
            } else {
                result -= numberCurrent;
            }
        }
        return result;
    }
}
