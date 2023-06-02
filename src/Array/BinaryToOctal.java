package Array;

import java.util.Scanner;

public class BinaryToOctal{
    static void BinToOctal(int e){
        int A[]=new int[20];
        int p=0;
          while(e!=0){
              int r= e%8;
              A[p]=r;
              p++;
              e=e/8;
          }
        for (int i = p-1; i >=0 ; i--) {
            System.out.print(A[i]);

        }

    }
    static int BinToDec(int n){
        int sum=0,p=1;
        while(n!=0){
            int a = n%10;
            sum=sum+a*p;
            p=p*2;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       int g = BinToDec(n);
        BinToOctal(g);
    }
}
