package Pattern;

import java.util.Scanner;

public class pattern {
    static void pat(int a) {
        int c = 65;
        int difference = 1;
        int middleNum = ((2 * a) - 1) / 2;
        int start = middleNum;
        int end = middleNum;
        for (int i = 0; i < a; i++) {

            int middle = c;
            for (int j = 0; j < (2 * a) - 1; j++) {
                if (j == middleNum) {
                    System.out.print((char) c);
                } else if (j < middleNum && j >= start) {
                    System.out.print((char)(middle-(middleNum-j)));
                } else if(j > middleNum && j <= end) {
                    System.out.print((char)(middle-Math.abs((middleNum-j))));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            c = c + ++difference;
            start--;
            end++;
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pat(n);

    }
}
