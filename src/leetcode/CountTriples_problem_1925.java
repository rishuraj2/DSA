package leetcode;

public class CountTriples_problem_1925 {
    private static int greatestCommonDivisor(int inputOne, int inputTwo) {
        if (inputTwo > inputOne) { // making sure that inputOne > inputTwo
            inputTwo = inputTwo + inputOne;
            inputOne = inputTwo - inputOne;
            inputTwo = inputTwo - inputOne;
        }

        while (inputTwo != 0) { // Euclidean algorithm
            int temp = inputTwo;
            inputTwo = inputOne%inputTwo;
            inputOne = temp;
        }
        return inputOne;
    }

    public static int countTriples(int n) {
        int a = 2;
        int b = 1;
        int divisor = (a*a)+(b*b);
        int totalTriples = 0;

        while (a*a <= n) {
            if (greatestCommonDivisor(a, b) == 1) {
                totalTriples += 2 * (int)(n/(divisor));
            }

            if ((b+2) < a) {
                b += 2;
            } else {
                a++;
                b = a%2 == 0? 1 : 2;
            }
            divisor = (a*a)+(b*b);
        }

        return totalTriples;
    }
}
