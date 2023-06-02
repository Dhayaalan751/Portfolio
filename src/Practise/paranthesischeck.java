package Practise;

import java.util.Scanner;

public class paranthesischeck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String b[] = {"(",")"};
        int n = s.nextInt();
        String a[] = new String[n];
        for (int r = 0; r < n; r++) {
            a[r] = s.next();
        }

        int count = 0;
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == b[0]) {
                if (a[n-1-i] == b[1]) {
                    count++;
                }
                else{
                    count=0;
                    break;
                }
            }
            else{
                break;
            }
        }
        if (count != 0) {
            System.out.println("Balanced");
        }
        else {
            System.out.println("Not Balanced");
        }
    }
}
