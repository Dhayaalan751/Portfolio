package Practise;
import java.util.Scanner;
public class strongNumber {
    static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    static int strongRNot(int n){
        int sum=0;
        while(n!=0){
            int a=n%10;
            sum=sum+factorial(a);
            n=n/10;
        }
        return sum;

    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int u = strongRNot(n);
        if(u==n)
            System.out.print("Strong number");
        else
            System.out.print("Not an Strong number");
    }
}
