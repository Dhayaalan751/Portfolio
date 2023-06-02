package Task.T8;

import java.util.Scanner;

public class FibonacciSeriesWithValidation {
    public static String checkInt(String n) {
        Scanner scan = new Scanner(System.in);
        if(n.charAt(0)=='0'){
            System.out.println("Please enter integer greater than zero");
            String b = scan.nextLine();
            return checkInt(b);
        }else {
            for (int i = 0; i < n.length(); i++) {
                if (!(n.charAt(i) >= 48 && n.charAt(i) <= 57)) {
                    System.out.println("Please enter a valid Integer: ");
                    String a = scan.nextLine();
                    return checkInt(a);
                }
            }
        }
        return n;
    }

    public static int stringIntoInt(String n) {
        int a = n.length() - 1;
        int i = 0;
        int sum = 0;
        while (i <= a) {
            sum = sum * 10 + ((int) n.charAt(i) - 48);
            i++;
        }
        return sum;
    }

    static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        if (n == 1)
            System.out.print(a);
        else {
            System.out.print(a + " " + b + " ");
            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range");
        String n = scan.nextLine();
        String a = checkInt(n);
        int b = stringIntoInt(a);
        fibonacci(b);

    }
}

