package Pattern;

import java.util.Scanner;

public class Number_pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j)
                    System.out.print(num);
                else if (i + j == n + 1)
                    System.out.print(num);
                else
                    System.out.print("  ");
            }
            num--;
            System.out.println();
        }
    }
}