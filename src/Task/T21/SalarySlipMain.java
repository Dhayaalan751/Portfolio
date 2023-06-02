package Task.T21;

import java.util.Scanner;

public class SalarySlipMain {

    static String checkName(){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        while(!name.matches("[A-Za-z ]+")){
            System.out.println("Please enter a valid Name: ");
            return checkName();
        }
        return name;
    }
    static String checkId(){
        Scanner scan = new Scanner(System.in);
        String id = scan.nextLine();
        while(!id.matches("[1-9]{0,7}")){
            System.out.println("Please enter a valid ID: ");
            return checkId();
        }
        return id;
    }
    static String checkDeg(){
        Scanner scan = new Scanner(System.in);
        String deg = scan.nextLine();
        while(!deg.matches("[A-Za-z\s]+")){
            System.out.println("Please enter a valid Designation");
            return checkDeg();
        }
        return deg;
    }
    static String checkAdd(){
        Scanner scan = new Scanner(System.in);
        String add = scan.nextLine();
        while(!add.matches("^[#.0-9a-zA-Z\\s,-]+$")){
            System.out.println("Please enter a valid Address");
            return checkAdd();
        }
        return add;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the noOf Employee: ");
        int noOf = scan.nextInt();
        Employee obj[] = new Employee[noOf];
        for (int i = 0; i < noOf; i++) {
            Employee std = new Employee();
            System.out.println("Enter the Employee name: ");
            scan.nextLine();
            String name = checkName();
            System.out.println("Enter the ID: ");
            String id = checkId();
            System.out.println("Enter the Designation: ");
            String deg = checkDeg();
            System.out.println("Enter the Address: ");
            String add = checkAdd();
            std.setdetails(name,id,deg,add);
            obj[i]=std;
        }
        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.printf("%1s%15s%15s%15s%15s%15s%15s", "Name", "ID","Designation","Address","Gross","Net","Tax");
        System.out.println();

        System.out.println("---------------------------------------------------------------------------------------------- -----");

        for (int i = 0; i <noOf ; i++) {
            obj[i].display();
        }
    }
}
