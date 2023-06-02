package Pattern;

import java.util.Scanner;

public class integerOrNot {
    public  static boolean checkInt(String n){
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        for(int i=0;i<n.length();i++)
            if(!(n.charAt(i) >= 48 && n.charAt(i)<= 57)){
                System.out.println("Please enter a valid Integer: ");
                String a = scan.nextLine();
               return checkInt(a);
            }
        return flag;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        boolean flag =  checkInt(n);
        System.out.println(flag);




    }
}
