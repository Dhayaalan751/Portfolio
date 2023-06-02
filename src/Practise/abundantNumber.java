package Practise;
import java.util.Scanner;
public class abundantNumber {
    static int abundantRNot(int n){
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
        int y = abundantRNot(n);
        if(y>n)
            System.out.print("abundant number");
        else
            System.out.print("Not an abundant number");

    }
}
