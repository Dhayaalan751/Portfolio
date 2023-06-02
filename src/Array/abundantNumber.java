package Array;

import java.util.Scanner;

public class abundantNumber {
    static void checkabundant(int n){
        int j=0;
        for (int i = 1; i <n ; i++) {
            if(n%i==0){
                j=j+i;
            }
        }
        if(j>n)
            System.out.println("Abundant number");
        else
            System.out.println("not abundant number");

    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        checkabundant(n);
    }
}
