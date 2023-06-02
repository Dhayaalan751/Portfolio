package Array;

import java.util.Scanner;

public class rangeArmStrong {
    static int pow(int g,int y){
        int val=1;
        for(int i=0;i<y;i++){
            val=val*g;
        }
        return val;
    }
    static int digitcount(int i){
        int count=0;
        while(i!=0){
            count++;
            i=i/10;
        }
        return count;
    }
    static boolean checkarmstrong(int i){
        int y=digitcount(i);
        boolean flag=false;
        int sum=0;
        int u=i;
        while(u!=0){
            int g=u%10;
            sum=sum+pow(g,y);
            u=u/10;
        }
        if(sum==i)
            flag=true;
        return flag;

    }
    static void addarmstrong(int a,int b ){
        int j=0;
        int A[]=new int[b-a];
        for(int i=a;i<=b;i++){
            if(checkarmstrong(i)==true){
                A[j]=i;
                j++;
            }
        }
         int sum=A[0]+A[j-1];
         System.out.println(sum);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        addarmstrong(a,b);
    }
}
