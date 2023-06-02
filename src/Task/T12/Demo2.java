package Task.T12;

import java.util.Scanner;

public class Demo2 extends Demo1{
    static int a;
    final int  VARIABLE=0;

    Demo2(String Name, float Age, String Address, float Phnumber, String Dept) {
        super(Name, Age, Address, Phnumber, Dept);
    }

    static void switchcase(){
        System.out.println("Enter a number between 0 to 6 : ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        switch (n) {
            case 0:
                System.out.println( "Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
                switchcase();
        }
    }
    static void method(){
        System.out.println("Welcome you to DK's programming");
    }
    final void method2(){
        int a = 8;
    }
}
