package Practise;

import java.util.Scanner;

public class armStrongRange {
    static int digitcount(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    static int pow(int n,int count){
        int val = 1;
        for(int i=0;i<count;i++){
            val=val*n;
        }
        return val;
    }
    static int armStrongRNot(int n){
        int count = digitcount(n);
        int sum = 0;
        while(n!=0){
            int u=n%10;
            sum=sum+pow(u,count);
            n=n/10;
        }
        return sum;
    }
    static void armstrongrange(int a,int b){
        int [] c = new int[b-a];
        int t=0;
        for(int i=a;i<=b;i++){
            if(armStrongRNot(i)==i){
                c[t]=i;
                t++;
            }
        }
        for(int i=0;i<b-a;i++){
            if(c[i]!=0)
            System.out.print(c[i]+" ");
        }
    }

    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        armstrongrange(a,b);

    }
}

