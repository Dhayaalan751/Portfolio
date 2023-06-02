package Pattern;

import java.util.Scanner;

public class pattern2 {
    static void pattern4(int n) {
        int len=2*n-1;
        int c=65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                if (i + j < n-1)
                    System.out.print(" ");
                else
                    System.out.print((char) c++);
            }
            int b=c-2;
            for (int j = 0; j < i; j++) {
                System.out.print((char) b--);
                }
            System.out.println(" ");
        }
        System.out.println(" ");
        char t='a';
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern4(n);
    }
}
