package Array;

import java.util.Scanner;

public class nonPrimenum {
    static void nonPrimeNum(int a, int b) {
        int c[] = new int[b - a];
        int h = 0;
        for (int i = a; i <= b; i++) {
            for (int j = 2; j < i; j++) {

                if (i % j == 0 ) {
                    c[h] = i;
                    h++;
                    break;
                }
            }
        }
        int g = 0;
        for (int l = 0; l < c.length; l++) {
            if (c[l] == 0)
                g++;
        }
        for (int o = 0; o < c.length-g ; o++) {
            System.out.println(c[o]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        nonPrimeNum(a, b);

    }
}

