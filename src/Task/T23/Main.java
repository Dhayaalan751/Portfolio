package Task.T23;

import java.util.Scanner;
public class Main {
    public static String checkName() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        while (!name.matches("[A-Za-z ]+")) {
            System.out.println("PLEASE ENTER A VALID NAME: ");
            return checkName();
        }
        return name;
    }
    static String findDeg(){
        Scanner scan = new Scanner(System.in);
        String deg = "";
        try {
            System.out.println("(1-B.E, 2-B.Sc, 3-M.Sc, 4-B.Tech,)");
            System.out.println("ENTER THE DEGREE: ");
            int a = scan.nextInt();
            switch (a) {
                case 1:
                    deg = "B.E";
                    break;
                case 2:
                    deg = "B.Sc";
                    break;
                case 3:
                    deg = "M.Sc";
                    break;
                case 4:
                    deg = "B.Tech Integrated";
                    break;
                default:
                    throw new Exception();

            }
        } catch (Exception e) {
            System.out.println("ENTER THE VALID NUMBER AS MENTIONED ABOVE: ");
            return findDeg();
        }
        return deg;
    }
    static String checkReg() {
        Scanner scan = new Scanner(System.in);
        String reg = scan.nextLine();
        while (!reg.matches("[0-9]{4}")) {
            System.out.println("PLEASE ENTER A VALID ID: ");
            return checkReg();
        }
        return reg;
    }

    static int checkYear(String degree){
        Scanner scan = new Scanner(System.in);
        int yr =0;
        if(degree.equalsIgnoreCase("B.E") ){
            try {
                yr = scan.nextInt();
                if(yr <4) {
                    throw new Exception();
                }
            }catch (Exception e) {
                System.out.println("ENTER A VALID YEAR: ");
                return checkYear(degree);
            }
            return yr;
        } else if (degree.equalsIgnoreCase("B.Sc")) {
            try {
                yr = scan.nextInt();
                if (yr < 3) {
                    throw new Exception();
                }
            }catch(Exception e) {
                System.out.println("ENTER A VALID YEAR: ");
                return checkYear(degree);
            }
            return yr;

        } else if (degree.equalsIgnoreCase("M.Sc")) {
            try {
                yr = scan.nextInt();
                if (yr < 2) {
                    throw new Exception();
                }
            }catch (Exception e) {
                System.out.println("ENTER A VALID YEAR: ");
                return checkYear(degree);
            }
            return yr;
        } else {
            try {
                yr = scan.nextInt();
                if (yr < 5) {
                    throw new Exception();
                }
            }catch(Exception e){
                System.out.println("ENTER A VALID YEAER: ");
                return checkYear(degree);
            }
            return yr;
        }
    }
    static int checkPrinciple(){
        Scanner scan = new Scanner(System.in);
        int pA=0;
        try {
            pA = scan.nextInt();
            if (!(pA >= 300000 && pA <= 3000000)) {
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println("ENTER A VALID AMOUNT: ");
            return checkPrinciple();
        }
        return pA;
    }
    static String checkBank(){
        Scanner scan = new Scanner(System.in);
        String bank = "";
        try {
            System.out.println("(1.SBI, 2.ICICI, 3.INDIAN, 4.CENTRAL)");
            System.out.println("ENTER THE NUMBER OF THE BANK: ");
            int a = scan.nextInt();
            switch (a) {
                case 1:
                    bank = "SBI";
                    break;
                case 2:
                    bank = "ICICI";
                    break;
                case 3:
                    bank = "INDIAN";
                    break;
                case 4:
                    bank = "CENTRAL";
                    break;
                default:
                    throw new Exception();

            }
        } catch (Exception e) {
            System.out.println("ENTER THE VALID NUMBER AS MENTIONED ABOVE: ");
            return checkBank();
        }
        return bank;
    }

    public static void main(String[] args) {
        Student ob = new Student();
        System.out.println("ENTER THE STUDENT NAME: ");
        String name = checkName();
        System.out.println("ENTER THE REGISTER NUMBER: ");
        String reg = checkReg();
        System.out.println("ENTER THE COLLEGE NAME: ");
        String college = checkName();
        System.out.println("ENTER THE DEGREE: ");
        String degree = findDeg();
        System.out.println("ENTER THE YEARS FOR PAYING EMI: ");
        int year = checkYear(degree);
        System.out.println("ENTER THE BANK: ");
        String bank = checkBank();
        System.out.println("ENTER THE PRINCIPLE AMOUNT: ");
        int principle = checkPrinciple();
        ob.setDetails(name,reg,college,degree,year,bank,principle);
        ob.display();

    }
}
