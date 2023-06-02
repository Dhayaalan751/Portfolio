package Practise;
import java.util.Scanner;
public class sumOfPrimedigits {
    static boolean isprime(int n){
        boolean flag=true;
        for(int i=2;i<n;i++){
            if(n%i==0)
                flag=false;
        }
        return flag;
    }
    static void sumofprime(int n){
        int sum=0;
        while(n!=0){
            int u=n%10;
            if(isprime(u))
                sum=sum+u;
            n=n/10;
        }
        System.out.print(sum);
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        sumofprime(n);
    }
}
