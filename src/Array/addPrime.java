package Array;

import java.util.Scanner;

public class addPrime {
    static boolean checkPrime(int sum) {
        boolean flag = true;
        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
   static void addPrimeEven(int n){
       int A[]=new int[50];
       int j=0;
           for (int i=2; i<=200 ; i=i+2) {
               int sum=n+i;
               if(checkPrime(sum)){
                   A[j]=i;
                   j++;
                   if(j==6)
                       break;
               }
           }
       for(int c = 0; c<5; c++) {
           System.out.println(A[c]);
       }
       }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        addPrimeEven(n);

    }

}
