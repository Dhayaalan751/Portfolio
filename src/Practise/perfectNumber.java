package Practise;

import java.util.Scanner;

public class perfectNumber {
    static int perfectRNot(int n){
    int sum=0;
    for(int i=1;i<n;i++){
        if(n%i==0){
            sum=sum+i;
        }
    }
    return sum;
}
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int y = perfectRNot(n);
        if(y==n)
            System.out.print("perfect number");
        else
            System.out.print("Not a perfect number");

    }
}
