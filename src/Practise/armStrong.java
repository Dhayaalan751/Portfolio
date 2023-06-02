package Practise;
import java.util.Scanner;
public class armStrong {
    static int digitcount(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    static int pow(int n,int count){
        int val = 1;
        for(int i=0;i<count;i++){
            val=val*n;
        }
        return val;
    }
    static int armStrongRNot(int n){
        int count = digitcount(n);
        int sum = 0;
        while(n!=0){
            int u=n%10;
            sum=sum+pow(u,count);
            n=n/10;
        }
        return sum;
    }

    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int y =armStrongRNot(n);
        if(y==n)
            System.out.print("armstrong");
        else
            System.out.print("Not an armstrong");
    }
}
