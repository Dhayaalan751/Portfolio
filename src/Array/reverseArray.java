package Array;

import java.util.Scanner;

public class reverseArray {
    static void reverse(int A[]){
          int i=0;
          int temp;
          int j=A.length-1;
         while(i<j){
            temp=A[i];
           A[i] = A[j];
            A[j]=temp;
            i++;
            j--;
        }
        for (int k=0; k<A.length; k++) {
            System.out.print(A[k]);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int A[]=new int[n];
        for (int i = 0; i <n ; i++) {
            A[i] = s.nextInt();
        }
        reverse(A);


    }
}
