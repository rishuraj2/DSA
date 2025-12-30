package recursion;

public class Power {
    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1/x;
            N = -N;
        }

        return fastPower(x, N);
    }

    private static double fastPower(double x, long n) {
        if (n == 0)
            return 1;

        double half = fastPower(x, n/2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}