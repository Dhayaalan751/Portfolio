package Practise;
import java.util.Scanner;
public class fibonaciSeries {
    static void fibonaci(int n){
       int a=0;
       int b=1;
       if(n==1)
           System.out.print(b);
           else
           {
               System.out.print(a+" "+b+" ");
               for(int i=2;i<n;i++){
                   int c=a+b;
                   System.out.print(c+" ");
                   a=b;
                   b=c;
               }
           }
       }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        fibonaci(n);
    }
}

