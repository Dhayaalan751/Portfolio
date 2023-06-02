package Array;

import java.util.Scanner;

public class hashing {


    static int maxi(int a[], int n) {
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (max < a[i])
                max = a[i];
        }
        return max;
    }

    static void occurence(int a[], int n) {
        int max = maxi(a, n);
        int b[]= new int[max+1];
        for (int i = 0; i <b.length ; i++) {
            b[i]=0;
        }
        for (int i = 0; i <a.length ; i++) {
            int y=a[i];
            b[y]++;
        }
        for (int i = 0; i <b.length ; i++) {
            int k =b[i];
            if(k!=0){
                System.out.println(i+" - "+k);
            }
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int a[] = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
        }
        occurence(a, n);
    }

}
