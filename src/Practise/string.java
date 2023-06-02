package Practise;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String B ="a2b12";
        char A[] = B.toCharArray();
        for (int i = 0; i < A.length ; i++) {
            if(A[i]>='a' && A[i]<='z'){
                System.out.print(A[i]);
                int p=i;
                int sum=0;
               while(A[p+1]>='0' && A[p+1]<='9'){
                    sum=(sum*10)+(A[p+1]-48); 
                    p++;
                    if(p==A.length-1)
                        break;
                }
               for(int j=1;j<sum;j++){
                   System.out.print(A[i]);
               }
            }
        }
    }
}
