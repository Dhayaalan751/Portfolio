package Practise;

import java.util.Scanner;

public class primeRange {

    static int prime(int n) {
        int a = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                a = 0;
            }
        }
        return a;
    }

    static void primerange(int a, int b) {
        int[] c = new int[b - a];
        int t = 0;
        for (int i = a; i <= b; i++) {
            if (prime(i) == 1) {
                c[t] = i;
                t++;
            }
        }
        for (int i = 0; i < b - a; i++) {
            if (c[i] != 0)
                System.out.print(c[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        primerange(a, b);
    }
}
