package Task.T22;

import java.util.Scanner;


public class Main {
    static String checkName() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        while (!name.matches("[A-Za-z ]+")) {
            System.out.println("PLEASE ENTER A VALID NAME: ");
            return checkName();
        }
        return name;
    }

    static String checkId() {
        Scanner scan = new Scanner(System.in);
        String id = scan.nextLine();
        while (!id.matches("[1-9]{0,7}")) {
            System.out.println("PLEASE ENTER A VALID ID: ");
            return checkId();
        }
        return id;
    }

    static String checkDeg() {
        Scanner scan = new Scanner(System.in);
        String deg = scan.nextLine();
        while (!deg.matches("[A-Za-z\s]+")) {
            System.out.println("PLEASE ENTER A VALID DESIGNATION: ");
            return checkDeg();
        }
        return deg;
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
    static int checkInt(){
        Scanner scan = new Scanner(System.in);
        int kasu = 0;
        try{
            kasu = scan.nextInt();
        }catch(Exception e){
            System.out.println("ENTER THE VALID NUMBER: ");
            return checkInt();
        }
        return kasu;
    }
    static int checkYear(){
        Scanner scan = new Scanner(System.in);
        int years = 0;
        try{
            years = scan.nextInt();
            if(years<=0){
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println("ENTER A VALID YEAR: ");
            return checkYear();
        }
        return years;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee ob = new Employee();
        System.out.println("ENTER THE EMPLOYEE NAME: ");
        String name = checkName();
        System.out.println("ENTER THE EMPLOYEE ID: ");
        String id = checkId();
        System.out.println("ENTER THE EMPLOYEE DESIGNATION:");
        String designation = checkDeg();
        String bank = checkBank();
        System.out.println("ENTER THE BASIC PAY: ");
        int basicPay = checkInt();
        System.out.println("ENTER THE YEAR'S: ");
        int years = checkYear();
        ob.setDetails(name,id,designation,bank,basicPay,years);
        ob.display();

    }
}
