package Practise;
import java.util.Scanner;
public class Power {
    static void pow(int n,int p){
        int val=1;
        for(int i=0;i<p;i++){
            val=val*n;
        }
        System.out.print(val);
    }
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();
        pow(n,p);
    }
}
