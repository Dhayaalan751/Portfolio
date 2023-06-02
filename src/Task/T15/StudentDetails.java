package Task.T15;
import java.util.Scanner;

public class StudentDetails{

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    static String ValName() {
        Scanner scan = new Scanner(System.in);
        String name = "";
        try {
            System.out.println("Enter the Name:(Dhayaalan K)");
            name = scan.nextLine();
//            System.out.println(name.length());
            for (int i = 0; i < name.length(); i++)
                if (!(name.charAt(name.length() - 2) == 32 && name.charAt(0) != 32)) {
                    throw new Exception();
                }
        } catch (Exception e) {
//            System.out.println("Enter a valid name");
            System.out.println("Enter the name like first name,space,lastname ");
            return ValName();
        }
        return name;
    }

    static int digitCount(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    static int Valreg() {
        Scanner scan = new Scanner(System.in);
        int reg = 0;
        try {
            System.out.println("Enter the register number");
            reg = scan.nextInt();
            int count = digitCount(reg);
            if (count != 7 && reg <= 0) {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Enter a valid regNo like (1912024)");
            return Valreg();
        }
        return reg;
    }

    static String Valdept() {
        Scanner scan = new Scanner(System.in);
        String dept = "";
        try {
            System.out.println("(1.CS, 2.Mechanical, 3.EEE, 4.civil, 5.ECE)");
            System.out.println("Enter the no of the department: ");
            int a = scan.nextInt();
            switch (a) {
                case 1:
                    dept = "ComputerScience";
                    break;
                case 2:
                    dept = "Mechanical";
                    break;
                case 3:
                    dept = "EEE";
                    break;
                case 4:
                    dept = "Civil";
                    break;
                case 5:
                    dept = "ECE";
                    break;
                default:
                    throw new Exception();

            }
        } catch (Exception e) {
            System.out.println("Enter a valid Number as in above mentioned");
            return Valdept();
        }
        return dept;
    }

    static String Valcollege() {
        Scanner scan = new Scanner(System.in);
        String col = "";
        try {
            System.out.println("Enter the college name: ");
            col = scan.nextLine();
            for (int i = 0; i < col.length(); i++)
                if (!(col.charAt(0) == 32 && (col.charAt(i) >= 65 && col.charAt(i) <= 90) || (col.charAt(i) >= 97 && col.charAt(i) <= 122)))
                    throw new Exception();
        } catch (Exception e) {
            System.out.println("Enter a valid college name");
            return Valcollege();
        }
        String upper=col.toUpperCase();
        return upper;
    }

    static float ValMark() {
        Scanner scan = new Scanner(System.in);
        float mark = 0f;
        try {
            System.out.println("Enter the Mark: ");
            mark = scan.nextFloat();
            if (!(mark >= 0 && mark <= 100)) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Enter a valid Mark");
            return ValMark();
        }
        return mark;
    }

    static int checkInt(){
        Scanner scan = new Scanner(System.in);
        int a =0;
        try{
            System.out.println("Enter number of students: ");
            a = scan.nextInt();
        }catch(Exception e){
            System.out.println("Enter a valid number");
            return checkInt();
        }
        return a;
    }

    public static void main (String[] args) throws CloneNotSupportedException {
        int noOf =checkInt();
        Student obj[] = new Student[noOf];

        for (int i = 0; i < noOf; i++) {

            Student std = new Student();
            System.out.println("Enter student " + (i + 1) + "details");
            String Name = ValName();
            int Register = Valreg();
            String department = Valdept();
            String college = Valcollege();
            float mark1 = ValMark();
            float mark2 = ValMark();
            float mark3 = ValMark();
            std.assigningOperator(Name, Register, mark1, mark2, mark3, department, college);
            obj[i]=std;
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s", "Name", "RegNo","college","department","Mark1","Mark2","Mark3","Percentage");
        System.out.println();

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i <noOf ; i++) {
            obj[i].display();
        }
        Student obj1 = obj[0].clone();
        System.out.println("Cloned Object: ");
        System.out.println(obj1.name);
    }
}
//&& ((name.charAt(i) >= 65 && name.charAt(i) <= 90) || (name.charAt(i) >= 97 && name.charAt(i) <= 122)){
