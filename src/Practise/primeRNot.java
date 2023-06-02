package Practise;
import java.util.Scanner;
public class primeRNot {
    static int prime(int n){
        int a=1;
        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                a = 0;
            }
        }
        return a;
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int v = prime(n);
        if(v==1)
            System.out.print("prime");
            else
                System.out.print("Not a prime");
        }
    }
