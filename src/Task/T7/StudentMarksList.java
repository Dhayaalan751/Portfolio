package Task.T7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMarksList {

    public static int digitCount(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
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

    public static int checkInt(String n) {
        Scanner sc = new Scanner(System.in);
        if(n.length()==7) {
            for (int i = 0; i < n.length(); i++) {
                if (!(n.charAt(i) >= 48 && n.charAt(i) <= 57)) {
                    System.out.println("Please enter a valid Register Number: ");
                    String a = sc.nextLine();
                    return checkInt(a);
                }
            }
        }
        else {
            System.out.println("Please enter a valid Register Number: ");
            String a = sc.nextLine();
            return checkInt(a);

        }

        return Integer.parseInt(n);
    }
    public static float checkFloat(String n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n.length(); i++)
            if (!(n.charAt(i) >= 48 && n.charAt(i) <= 57 )) {
                System.out.println("Please enter a valid Mark: ");
                String a = scan.nextLine();
                return checkFloat(a);
            }
        float b = Float.parseFloat(n);
        if(!(b>=0 && b<=100)){
            String na = Float.toString(b);
            checkFloat(na);
        }
        return b;
    }

    public static void main(String[] args) {

        List<StudentDetails> std = new ArrayList<>();
//        StudentDetails[] ss = new StudentDetails[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of students: ");
        int noOfStd = s.nextInt();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < noOfStd; i++) {

            System.out.println("Enter Student Name " + (i + 1) + ": ");
            String Na = sc.nextLine();
            String Name = checkString(Na);
            System.out.println("Enter  Student Reg Number " + (i + 1) + ": ");
            String reg = sc.nextLine();
            int regNo = checkInt(reg);
            System.out.println("Enter Mark-1: ");
            String mar1 = sc.nextLine();
            float mark1 = checkFloat(mar1);
            System.out.println("Enter Mark-2: ");
            String mar2 = sc.nextLine();
            float mark2 = checkFloat(mar2);
            System.out.println("Enter Mark-3: ");
            String mar3 = sc.nextLine();
            float mark3 = checkFloat(mar3);
            System.out.println("Enter Mark-4: ");
            String mar4 = sc.nextLine();
            float mark4 = checkFloat(mar4);
            System.out.println("Enter Mark-5: ");
            String mar5 = sc.nextLine();
            float mark5 = checkFloat(mar5);


//            StudentDetails s = new StudentDetails();
            StudentDetails stud = new StudentDetails(Name, regNo,mark1,mark2,mark3,mark4,mark5);
//            ss[i]=stud;
            std.add(stud);
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s", "Name", "RegNo","Mark1","Mark2","Mark3","Mark4","Mark5","Total","Average","Percentage");
        System.out.println();

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (StudentDetails st : std) {

            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s", st.getName(), st.getRegNo(),st.getMark1(),st.getMark2(),st.getMark3(),st.getMark4(),st.getMark5(),st.getTotal(),st.getAverage(),st.getPercentage()+"%");
            System.out.println();

            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}

