package Array;

import java.util.Scanner;

public class searchIndex {
    static void SearchIn(int A[], int n, int k, int u) {
        int p, r;
        for (int i = 0; i < n; i++) {
            if (A[i] == k) {
                for (int j = i + 1; j < n; j++) {
                    if (A[j] == u)
                        break;
                    else
                        System.out.print(A[j] + " ");

                }
                break;
            }
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
        SearchIn(A, n, k, u);
    }
}
