package Task.T14;

import java.text.DecimalFormat;
import java.util.Scanner;


public class MathFunWithMethodOverloading {
    int a =98;
    int b = 87;
    static int checkInt() {
        Scanner scan = new Scanner(System.in);
        int a=0;
        try {
            a = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Enter a valid number: ");
            checkInt();
        }
        return a;
    }
    static Long checkLong() {
        Scanner scan = new Scanner(System.in);
        long a=0;
        try {
            a = scan.nextLong();
        } catch (Exception e) {
            System.out.println("Enter a valid number: ");
            checkLong();
        }
        return a;
    }
    static Float checkFloat() {
        Scanner scan = new Scanner(System.in);
        Float a=0f;
        try {
            a = scan.nextFloat();
        } catch (Exception e) {
            System.out.println("Enter a valid number: ");
            checkFloat();
        }
        return a;
    }
    static Double checkDouble() {
        Scanner scan = new Scanner(System.in);
        double a=0d;
        try {
            a = scan.nextFloat();
        } catch (Exception e) {
            System.out.println("Enter a valid number: ");
            checkDouble();
        }
        return a;
    }
    void doOperation(){
        System.out.println("The result of a-b is"+a+"-"+b);
        System.out.println(a-b);
    }
    void doOperation(int a,int b){
        System.out.println("The result of a+b is "+a+"+"+b);
        System.out.println(a+b);
    }
    void doOperation(long a,long b){
        System.out.println("The result of a*b is "+a+"*"+b);
        System.out.println(a*b);
    }
    void doOperation(long a,long b,long c){
        System.out.println("The result of a*b*c is "+a+"*"+b+"*"+c);
        System.out.println(a*b*c);
    }
    void doOperation(long a,long b,int c){
        System.out.println("The result of (a+b)/c is "+"("+a+"+"+b+")"+"/"+c);
        System.out.println((a+b)/c);
    }
    void doOperation(float a,double b){
        System.out.println(a);
        System.out.println(b);
        System.out.println("The result of float "+b+"+"+a);
        System.out.format("%.1f", b+a);
    }

    public static void main(String[] args) {
        boolean flag = true;
        do {
            Scanner scan = new Scanner(System.in);
            MathFunWithMethodOverloading obj = new MathFunWithMethodOverloading();
            System.out.println("Enter 8 inputs");
            int a = checkInt();
            int b = checkInt();
            int c = checkInt();
            long d = checkLong();
            long e = checkLong();
            long f = checkLong();
            double g = scan.nextDouble();
            float h = scan.nextFloat();
            obj.doOperation();
            System.out.println("");
            obj.doOperation(a, b);
            obj.doOperation(d, e);
            obj.doOperation(a, b, c);
            obj.doOperation(a, b, c);
            obj.doOperation(d, e, f);
            obj.doOperation(d, e);
            obj.doOperation(h, g);
            String pat = "#,##,###.###";
            DecimalFormat rt = new DecimalFormat(pat);
            System.out.println();
            System.out.println(rt.format(g));
            System.out.println("Do you want to continue:(Y/N)");
            String o = scan.nextLine();
            if(o.equalsIgnoreCase("n")){
                flag = false;
            }


        }while(flag);


    }
}
