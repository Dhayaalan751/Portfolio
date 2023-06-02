package Task.T10;

import java.util.Scanner;

public class ReadArray {
    public static int[] sortingAsc(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static int[] sortingDesc(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static int[] copy(int a[], int n) {
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        return b;
    }

    public static String checkInt(String n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n.length(); i++)
            if (!(n.charAt(i) >= 48 && n.charAt(i) <= 57)) {
                System.out.println("Please enter a valid Integer: ");
                String a = scan.nextLine();
                return checkInt(a);
            }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements");
        int n = Integer.parseInt(checkInt(sc.nextLine()));
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(checkInt(sc.nextLine()));
        }

        System.out.println("Copy");
        int p[] = copy(a, n);
        for (int i = 0; i < n; i++) {
            System.out.println(p[i]);
        }

        System.out.println("Ascending");
        int c[] = sortingAsc(p, n);
        for (int i = 0; i < n; i++) {
            System.out.println(c[i]);
        }

        System.out.println("Descending");
        int d[] = sortingDesc(p, n);
        for (int i = 0; i < n; i++) {
            System.out.println(d[i]);
        }


    }
}
