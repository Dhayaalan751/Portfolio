package Task.T9;

import java.util.Scanner;

public class ReadVariable {
    public static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        return sum;
    }

    public static int rev(int n) {
        int sum = 0;
        while (n != 0) {
            int i = n % 10;
            sum = (sum * 10) + i;
            n = n / 10;
        }
        return sum;
    }

    public static int BiggestNumber(int num) {
        int max = num % 10;
        num = num / 10;
        while (num != 0) {
            int a = num % 10;
            if (max < a)
                max = a;
            num = num / 10;
        }
        return max;
    }

    public static int FindSmallestNumber(int num) {
        int min = num % 10;
        num = num / 10;
        while (num != 0) {
            int a = num % 10;
            if (min > a)
                min = a;
            num = num / 10;
        }
        return min;
    }

    public static int digitCount(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static int average(int n) {
        int avg = digitSum(n) / digitCount(n);
        return avg;
    }

    public static int IndexPosition(int index,int count,int a) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        if (!(index >= 0 && index <= count)) {
            System.out.println("Please Enter valid Index");
            int y = s.nextInt();
            return IndexPosition(y,count,a);
        } else {
            int b[] = new int[count];
            i=count-1;
            while (a != 0) {
                int p = a % 10;
                b[i] = p;
                i--;
                a = a / 10;
            }
            return b[index - 1];
        }
    }

    public static void intIntoString(int n) {

        int i =digitCount(n);
        String words[] = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        String hundreds[] = {"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        int a=n%10;
        n=n/10;
        int b=n%10;
        n=n/10;
        int c=n%10;
        if(i==1){
            System.out.println(words[a-1]);
        }
        else if(i==2){
            System.out.println(hundreds[b-2] + words[a-1]);
        }
        else if(i==3){
            System.out.println(words[c-1]+" hundred and "+hundreds[b-2]+" "+words[a-1]);
        }

    }

    public static void midElement(int n) {
        int count = digitCount(n);
        if (count % 2 != 0) {
            for (int i = 0; i < count / 2; i++)
                n = n / 10;
            System.out.println("Mid_Element: " + n % 10);
        } else {
            for (int i = 0; i < count / 2 - 1; i++)
                n = n / 10;
            int a = n / 10;
            System.out.println("Mid_Element: " + a % 10 + "," + n % 10);

        }

    }

    public static int power(int n, int c) {
        int val = 1;
        for (int i = 0; i < c; i++) {
            val = val * n;
        }
        return val;
    }

    public static void armStrongNumberOrNot(int n) {
        int c = digitCount(n);
        int a = n;
        int sum = 0;
        while (n != 0) {
            int y = n % 10;
            sum = sum + power(y, c);
            n = n / 10;
        }
        if (sum == a)
            System.out.println("ArmstrongNumber");
        else
            System.out.println("Not an ArmstrongNumber");
    }

    public static void repeating(int n, int c) {
        int max = BiggestNumber(n);
        int a[] = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
        while (n != 0) {
            int b = n % 10;
            a[b]++;
            n = n / 10;
        }
        System.out.println(c + " Occurs " + a[c] + " Times ");

    }

    public static void replacing(int n, int g, int d) {
        int count = digitCount(n);
        int a[] = new int[count];
        int i = 0;
        while (n != 0) {
            int b = n % 10;
            a[i] = b;
            n = n / 10;
            i++;
        }
        for (int j = 0; j < count; j++)
            if (a[j] == g) {
                a[j] = d;
                break;
            }
        for (int j = count-1; j>=0; j--) {
            System.out.print(a[j]);
        }

    }

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


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Integer :");
        int n = Integer.parseInt(checkInt(scan.nextLine()));
        System.out.println("Sum of Digits: " + digitSum(n));
        System.out.println("Reverse Order: " + rev(n));
        System.out.println("Find Biggest Number: " + BiggestNumber(n));
        System.out.println("Find Smallest NUmber: " + FindSmallestNumber(n));
        System.out.println("Find Average: " + average(n));
        System.out.println("Please Enter the index");
        int count = digitCount(n);
        System.out.println(IndexPosition(scan.nextInt(),count,n));
        intIntoString(n);
        midElement(n);
        armStrongNumberOrNot(n);
        System.out.println("Number of count: " + digitCount(n));
        System.out.println("Enter the integer to find the occurrence: ");
        int b = scan.nextInt();
        repeating(n, b);
        System.out.println("Enter the number to be changed: ");
        int c = scan.nextInt();
        System.out.println("Enter the value: ");
        int d = scan.nextInt();
        replacing(n, c, d);
    }
}
