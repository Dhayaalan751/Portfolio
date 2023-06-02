//package Array;
//
//import java.util.Scanner;
//public class Details {
//    static String name;
//    static int id;
//    static int mark1;
//    static int mark2;
//    static int mark3;
//    int percentage;
//
//    Details(String name, int id, int mark1, int mark2, int mark3) {
//        this.name = name;
//        this.id = id;
//        this.mark1 = mark1;
//        this.mark1 = mark2;
//        this.mark1 = mark3;
//
//    }
//
//    public Details() {
//
//    }
//
//    String getName(String n) {
//        return n;
//    }
//
//    int getId(int a) {
//        return a;
//    }
//
//    int getMark1(int a) {
//        return a;
//    }
//
//    int getMark2(int a) {
//        return a;
//    }
//
//    int getMark3(int a) {
//        return a;
//    }
//
//    static int getPercentage() {
//        int sum = mark1 + mark2 + mark3;
//        int res = sum / 3;
//        return res;
//    }
//
//    public static String checkString() {
//        Scanner ob = new Scanner(System.in);
//        String n = "";
//        try {
//            n = ob.nextLine();
//            for (int i = 0; i < n.length(); i++) {
//                if (!((n.charAt(i)) >= 65 && (n.charAt(i) <= 90 || (n.charAt(i)) >= 97 && (n.charAt(i) <= 122)))) {
//                    if (!((n.charAt(i)) == 32)) {
//
//                        throw new Exception();
//                    }
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("ENTER THE VALID NAME");
//            n = checkString();
//        }
//        return n;
//    }
//
//    public static int digitCount(int n) {
//        int count = 0;
//        while (n != 0) {
//            count++;
//            n = n / 10;
//        }
//        return count;
//    }
//
//    public static void checkInt() {
//        Scanner sc = new Scanner(System.in);
//        try {
//            int n = sc.nextInt();
//            int count = digitCount(n);
//            if (count != 4)
//                throw new Exception();
//        } catch (Exception e) {
//            System.out.println("ENTER THE VALID NUMBER");
//            checkInt();
//        }
//    }
//
//    public static int checkInteger() {
//        Scanner sc = new Scanner(System.in);
//        try {
//            int s = sc.nextInt();
//            if (!(s >= 0 && s <= 100)) {
//                throw new Exception();
//            }
//        } catch (Exception e) {
//            System.out.println("ENTER THE VALID NUMBER");
//            checkInteger();
//        }
//        return s;
//    }
//
//    public static void main(String[] args) throws CloneNotSupportedException {
//        Scanner std = new Scanner(System.in);
//        System.out.println("ENTER THE NAME");
//        Details.checkString();
//        System.out.println("ENTER THE ID NUMBER");
//        checkInt();
//        System.out.println("ENTER THE MARK1");
//        mark1 = checkInteger();
//        mark2 = checkInteger();
//        System.out.println("ENTER THE MARK3");
//        mark3 = checkInteger();
//        Details det = new Details();
//        System.out.println(mark1);
//
//        System.out.println("PERCENTAGE IS:" + det.percentage + "%");
//        //try {
//        //    Details det1 = (Details) det.clone();
//        //} catch (CloneNotSupportedException e) {
//        //    throw new RuntimeException(e);
//        //}
//        //System.out.println("PERCENTAGE IS:" + det.percentage + "%");
//
//    }
//}
