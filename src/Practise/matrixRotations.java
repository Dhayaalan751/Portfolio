package Practise;

import java.util.Scanner;

public class matrixRotations {
    public static int check(int c[][], int n, int b[][]) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (c[i][j] != b[i][j]) {
                    count++;
                    break;

                }

            }
            if (count == 1)
                break;

        }
        return count;
    }
        public static int[][] rotate ( int a[][], int n){
            int d[][] = new int[n][n];
            int len = n - 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    d[j][len] = a[i][j];

                }
                len--;
            }
            return d;
        }
        public static void main (String[]args){
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int a[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = s.nextInt();
                }
            }

            int q = s.nextInt();
            int b[][] = new int[q][q];
            for (int i = 0; i < q; i++) {
                for (int j = 0; j < q; j++) {
                    b[i][j] = s.nextInt();
                }
            }
            int k = 3;
            while (k > 0) {
                int c[][] = rotate(a, n);
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        a[i][j] = c[i][j];
                    }
                }
                int v = check(a, n, b);
                if (v == 0) {
                    System.out.println("True "+k);
                    break;
                }
                k--;
            }
            if(k==0){
                System.out.println("False");
            }
        }
    }

