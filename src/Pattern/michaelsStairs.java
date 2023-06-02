package Pattern;

import java.util.Scanner;

public class michaelsStairs {
   static void noOfstairs(int n){
        int count=n;
       count = count + n / 2 + 1;
        if(n%2!=0)
            System.out.println(count);
        else
            System.out.println(count-1);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>20)
            System.out.println("wrong infrastructure");
        else
            noOfstairs(n);
    }
}
