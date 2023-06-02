package Practise;
import java.util.Scanner;
public class mergesort {
        static void mergeSort(int a[],int n,int b[],int m){
            int i=0;
            int j=0;
            while(i<n && j<m){
                if(a[i]<b[j]){
                    System.out.print(a[i]);
                    i++;
                }
                else if(b[j]<a[i]){
                    System.out.print(b[j]);
                    j++;
                }
                else if(b[j]==a[i]){
                    System.out.print(b[j]);
                    j++;
                }
            }
            while(i<n){
                System.out.print(a[i]);
                i++;
            }
            while(j<m){
                System.out.print(b[j]);
                j++;
            }
        }

        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
            }

            int m = s.nextInt();
            int b[] = new int[m];
            for(int j=0;j<m;j++){
                b[j] = s.nextInt();
            }

            mergeSort(a,n,b,m);

        }
    }
/*6
3 5 6 9 13 16
5
4 5 7 10 11*/