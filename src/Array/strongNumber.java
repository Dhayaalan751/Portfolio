package Array;

import java.util.Scanner;

public class strongNumber {
    static int digitCount(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    static int factorial(int c) {
        int sum = 1;
        for (int j = 1; j <= c; j++)
            sum = sum * j;
        return sum;
    }

    static int StrongestNo(int n) {
        int a = digitCount(n);
        int p = 0;
        for (int i = 0; i < a; i++) {
            int c = n % 10;
            p = p + factorial(c);
            n = n / 10;
        }
       return p;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       int y = StrongestNo(n);
        if (y==n)
            System.out.println("strongNumber");
        else
            System.out.println("not a strongNumber");

    }
}
