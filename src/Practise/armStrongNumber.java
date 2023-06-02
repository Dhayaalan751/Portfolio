package Practise;

import java.util.Scanner;

public class armStrongNumber {
    public static int count(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static int power(int n, int c) {
        int val = 1;
        for (int i = 0; i < c; i++) {
            val = val * n;
        }
        return val;
    }

    public static void armStrongNumberOrNot(int n) {
        int c = count(n);
        int sum = 0;
        while (n != 0) {
            int y = n % 10;
            sum = sum + power(y, c);
            n = n / 10;
        }
        if (sum == n)
            System.out.println("Armstrongnumber");
        else
            System.out.println("Not an armstrongnumber");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        armStrongNumberOrNot(n);

    }
}