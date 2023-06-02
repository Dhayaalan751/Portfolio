package Practise;

import java.util.Scanner;

public class addingTwoNumber {
    static void adding(int a[],int n,int b[],int m) {
        long sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 = (sum1 * 10) + a[i];
        }
        long sum2 = 0;
        for (int i = 0; i < m; i++) {
            sum2 = (sum2 * 10) + b[i];
        }
        long sum = sum1 + sum2;
        int t = 0;
        int c[] = new int[n + 1];
        while (sum != 0) {
            long y = sum % 10;
            c[t] = (int) y;
            t++;
            sum = sum / 10;
        }

        for (int i = c.length - 1; i >= 0; i--) {
                System.out.print(c[i]);

        }
    }
    public static void main(String args[] ) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int m = s.nextInt();
        int b[] = new int[m];

        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }

        for(int i=0;i<m;i++){
            b[i]=s.nextInt();
        }
        adding(a,n,b,m);
    }
}
/*12
        9
        9 2 8 1 3 5 6 7 3 1 1 6
        7 8 4 6 2 1 9 9 7*/