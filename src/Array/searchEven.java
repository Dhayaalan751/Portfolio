package Array;

import java.util.Scanner;

public class searchEven {
    static void evenCount(int A[],int n){
        int count=0;
        for (int i = 0; i <n ; i++)
            if(A[i]%2==0)
                count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int A[]=new int[n];
        for (int i = 0; i < n; i++) {
            A[i]=s.nextInt();
        }
        evenCount(A,n);
    }
}
