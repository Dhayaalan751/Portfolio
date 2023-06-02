package Task.T24;

import java.util.Scanner;

public class BillMain {
    public static String checkName() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        while (!name.matches("[A-Za-z ]+")) {
            System.out.println("PLEASE ENTER A VALID NAME: ");
            return checkName();
        }
        return name;
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
    static int checkInt (){
        Scanner scan = new Scanner(System.in);
        int n=0;
        try{
            n = scan.nextInt();
            if(n<0){
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println("PLEASE ENTER A VALID NUMBER:");
            return checkInt();
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println("ENTER THE NAME: ");
        String name = checkName();
        System.out.println("ENTER THE UNIQUE ID: ");
        String uID = checkReg();
        System.out.println("ENTER THE UNITS: ");
        int units = checkInt();
        BillGenerate ob = new BillGenerate();
        ob.setDetails(name,uID,units);
        ob.display();

    }

}
