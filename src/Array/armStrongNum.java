package Array;

import java.util.Scanner;

public class armStrongNum {
    static int pow(int g, int a) {
        int val = 1;
        for (int j = 0; j <a; j++) {
             val *= g;
        }
        return val;

    }

    static int digitcount(int n) {
        int count=0;
        while(n!=0){
            count++;
           n = n/10;

        }
        return count;

    }

    static int armStrongNumrNot(int n) {
        int a = digitcount(n);
        int sum = 0;
        while (n != 0) {
            int g = n % 10;
            sum = sum + pow(g,a);
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int y = armStrongNumrNot(n);
        System.out.println(y);
           if(n == y)
            System.out.println("armstrongnumber");
           else
            System.out.println("Not a armstrongnumber");
    }
}
