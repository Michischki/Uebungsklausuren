package ws2021;

public class Main {

    public static void main(String[] args) {
        System.out.println(dfact(10));
    }

    public static long dfact(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be greater than 0");
        }

        int result = 1;

        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                result *= i;
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                result *= i;
            }
        }
        return result;
    }
}
