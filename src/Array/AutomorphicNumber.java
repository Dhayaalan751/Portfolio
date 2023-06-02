package Array;

import java.util.Scanner;

public class AutomorphicNumber {
    static int pow(int y) {
        int val = 1;
        for (int i = 0; i < 2; i++) {
            val = val * y;
        }
        return val;
    }

    static int digitCount(int n) {
        int c = 0;
        while (n > 0) {

            c++;
            n = n / 10;

        }
        return c;
    }

    static boolean autoMorphicNo(int n) {
        boolean result = true;
        int c = digitCount(n);
        int m = pow(n);
        while (c > 0) {
            int a = n % 10;
            int b = m % 10;
            if (a != b) {
                result = false;
                break;
            }
            n = n / 10;
            m = m / 10;
            c--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean a = autoMorphicNo(n);
        if (a) {
            System.out.println("Given number is Automorphic number");
        } else {
            System.out.println("Given number is not an Automorphic number");
        }
    }
}
