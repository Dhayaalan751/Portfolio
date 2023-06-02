package Array;

import java.util.Scanner;

public class rotate2 {
    static void rotate(int A[], int k, int n,int u ,int y) {
    while (k != 0) {

        int b = A[n - 1];
        for (int i = n; i > 1; i--)
            A[i - 1] = A[i - 2];
        A[0] = b;
        k--;
    }
    for (int r = u; r <=y; r++) {
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
        int u = s.nextInt();
        int y = s.nextInt();
        rotate(A, k, n,u,y);
    }
}
