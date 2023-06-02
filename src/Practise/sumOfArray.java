package Practise;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();
        int a[] = new int[n];
        for (int j = 0; j <n ; j++) {
            a[j] = s.nextInt();
        }
        boolean o=false;
        int x=0;
        int j=0;
        while(j!=n){
            int sum=0;
            for (int i = x; i <n; i++) {
                sum=sum+a[i];
                if(sum==p){
                    System.out.println("From" + (j+1) + "to" + (i+1));
                    o=true;
                }
            }
            if(o==true){
                break;
            }
            x++;
           j++;

        }
    }
}
