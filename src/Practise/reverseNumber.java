package Practise;

import java.util.Scanner;

public class reverseNumber {
    static void rev(int n){
        int sum=0;
        while(n!=0){
            int i=n%10;
            sum=(sum*10)+i;
            n=n/10;
        }
        System.out.print(sum);
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        rev(n);
    }
}
