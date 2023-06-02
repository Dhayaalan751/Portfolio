package Pattern;

import java.util.Scanner;

public class evenrOdd {
    static void checkevenrodd(int a) {
            if(a%2==0)
                System.out.println("even");
            else
                System.out.println("Odd");

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        checkevenrodd(n);
    }
}
