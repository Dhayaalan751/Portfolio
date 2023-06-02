package Array;

import java.util.Scanner;

public class Arrayof {
    static void occurence(int a[], int n) {
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = 0;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            b[i] = count;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        occurence(a, n);
    }
}
