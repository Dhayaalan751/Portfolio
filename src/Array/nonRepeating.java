package Array;

import java.util.Scanner;

public class nonRepeating {
    static int maximum(int a[], int n) {
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    static void nonrepeat(int a[],int n) {
        int max = maximum(a, n);
        int b[] = new int[max + 1];
        for (int i = 0; i < (max + 1); i++) {
            b[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            int k = a[i];
            b[k ]++;
        }
        int count = 0;
        for (int i = 0; i < (max + 1); i++) {
            if (b[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        nonrepeat(a,n);
    }
}