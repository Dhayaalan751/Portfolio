package Task.T12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Task.T12.Demo1.leapYear;
import static Task.T12.Demo1.stddev;
import static Task.T12.Demo2.method;
import static Task.T12.Demo2.switchcase;

public class Main  {

    public static String checkAddress(String n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n.length(); i++)

            if (!(((n.charAt(i) == 32) || (n.charAt(i) >= 65 && n.charAt(i) <= 90) || (n.charAt(i) >= 97 && n.charAt(i) <= 122)||(n.charAt(i) >= 48 && n.charAt(i) <= 57)) && (n.charAt(0) != 32))) {
                System.out.println("Please enter a valid Address: ");
                String a = scan.nextLine();
                return checkAddress(a);
            }
        return n;
    }
    public static String checkString(String n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n.length(); i++)

            if (!(((n.charAt(i) == 32) || (n.charAt(i) >= 65 && n.charAt(i) <= 90) || (n.charAt(i) >= 97 && n.charAt(i) <= 122)) && (n.charAt(0) != 32))) {
                System.out.println("Please enter a valid Name: ");
                String a = scan.nextLine();
                return checkString(a);
            }
        return n;
    }

    public static float checkFloat(String n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n.length(); i++)
            if (!(n.charAt(i) >= 48 && n.charAt(i) <= 57)) {
                System.out.println("Please enter a valid Age ");
                String a = scan.nextLine();
                return checkFloat(a);
            }
        float b = Float.parseFloat(n);

        return b;
    }


    public static int checkNum(String n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n.length(); i++)
            if (!(n.charAt(i) >= 48 && n.charAt(i) <= 57)) {
                System.out.println("Please enter a valid Year: ");
                String a = scan.nextLine();
                return checkNum(a);
            }
        int b = Integer.parseInt(n);
        if (b==0) {

            String na = scan.nextLine();
            checkNum(na);
        }
        return b;
    }

    public static long digitCount(long n) {
        long count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static long checkPH(String n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n.length(); i++)
            if (!(n.charAt(i) >= 48 && n.charAt(i) <= 57)) {
                System.out.println("Please enter a valid Phone Number: ");
                String a = scan.nextLine();
                return checkPH(a);
            }
        long b = Long.parseLong(n);
        long c = digitCount(b);
        if (!(c==10)) {
            System.out.println("Please enter a valid number");
            n = scan.nextLine();
            return checkPH(n);
        }
        return b;
    }

    public static void main(String[] args) {
        boolean flag = true;
        do {
            method();
            List<Demo1> std = new ArrayList<>();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the Year: ");
            int n = checkNum(s.nextLine());
            leapYear(n);

            System.out.println("Enter no of elements: ");
            int t = s.nextInt();
            double arr[] = new double[t];
            System.out.println("Enter the elements: ");
            for (int i = 0; i < t; i++) {
                arr[i] = s.nextInt();
            }
            stddev(arr, t);

            System.out.println("Enter no of students: ");
            int noOfStd = s.nextInt();
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < noOfStd; i++) {

                System.out.println("Enter Name " + (i + 1) + ": ");
                String Na = sc.nextLine();
                String Name = checkString(Na);
                System.out.println("Enter Age " + (i + 1) + ": ");
                String agech = sc.nextLine();
                float Age = checkFloat(agech);
                System.out.println("Enter Address ");
                String add = sc.nextLine();
                String Address = checkAddress(add);
                System.out.println("Enter the Phnumber :");
                String ph = sc.nextLine();
                float Phnumber = checkPH(ph);
                System.out.println("Enter the Dept :");
                String dp = sc.nextLine();
                String Dept = checkString(dp);


                Demo1 stud = new Demo1(Name, Age, Address, Phnumber, Dept);
                std.add(stud);

            }
            System.out.println("-----------------------------------------------------------------------");

            System.out.printf("%1s%15s%15s%15s%15s", "Name", "Age", "Address", "PhoneNumber", "Department");
            System.out.println();

            System.out.println("-----------------------------------------------------------------------");
            for (int i = 0; i < std.size(); i++) {
                std.get(i).display();
            }
            System.out.println(Demo2.a);
            switchcase();
            System.out.println("Do you want to repeat: (Y/N)");
            s.nextLine();
            String g = s.nextLine();
            if (g.equalsIgnoreCase("N")) {
                flag = false;
            }
        } while (flag);
    }

}