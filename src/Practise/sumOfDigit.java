package Practise;

import java.util.Scanner;

public class sumOfDigit {
    static void digitSum(int n){
        int sum=0;
        while(n!=0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        digitSum(n);
    }
}
