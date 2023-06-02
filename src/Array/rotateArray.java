package Array;

import java.util.Scanner;

public class rotateArray {
    static void rotate(int A[], int k, int n) {
        while (k != 0) {

            int b = A[n - 1];
            for (int i = n; i > 1; i--)
                A[i - 1] = A[i - 2];
            A[0] = b;
            k--;
        }
        for (int r = 0; r < n; r++) {
            System.out.println(A[r]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }
        int k = s.nextInt();
        rotate(A, k, n);
    }
}
