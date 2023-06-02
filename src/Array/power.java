package Array;

import java.util.Scanner;

public class power {
   static void pow(int n,int y){
       int val=1;
       for(int i =0;i<y;i++){
           val=val*n;
       }

       System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int y = s.nextInt();
        pow(n,y);


    }
}
