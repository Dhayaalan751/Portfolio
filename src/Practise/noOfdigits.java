package Practise;

import java.util.Scanner;

public class noOfdigits {
        public static void patternMatrix(char y[],int len)
        {
            int h=(2*len)-2;
            int g=0;
            for(int i=0;i<len;i++)
            {
                for(int j=0;j<=(2*len)-2;j++)
                {
                    if(j==h)
                    {
                        for(int k=h;k<=h+i;k++)
                        {
                            System.out.print(y[g]);
                            g++;
                        }
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                h=h-2;
                System.out.println();
                g=0;
            }

        }

        public static void main(String args[] ) throws Exception {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT */
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            char x[]=str.toCharArray();
            int len=x.length;
            int m=len/2;
            int k=0;
            char y[]=new char[len];
            for(int i=m;i<len;i++)
            {
                y[k]=x[i];
                k++;
            }
            for(int i=0;i<m;i++)
            {
                y[k]=x[i];
                k++;
            }
            patternMatrix(y,len);
}

}