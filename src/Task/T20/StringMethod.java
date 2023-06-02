package Task.T20;

import java.util.ArrayList;
import java.util.Scanner;

public class StringMethod {
    public static String checkString() {
        Scanner ob = new Scanner(System.in);
        String n = "";
        try {
            n = ob.nextLine();
            for (int i = 0; i < n.length(); i++) {
                if (!((n.charAt(i)) >= 65 && (n.charAt(i) <= 90 || (n.charAt(i)) >= 97 && (n.charAt(i) <= 122)))) {
                    if (!((n.charAt(i)) == 32)) {
                        throw new Exception();
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("ENTER THE VALID STRING");
            return checkString();
        }

        return n;
    }

    public static int countVowels(String n) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < n.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {

                if (n.charAt(i) == vowels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;

    }

    public static void findUpperCase(String n) {
        ArrayList<Character> obj = new ArrayList<>();
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) >= 65 && n.charAt(i) <= 90) {
                obj.add(n.charAt(i));
            }
        }
        if (obj.size() == 0) {
            System.out.println("NO UPPER CAS FOUND IN THE GIVEN STRING");

        } else {
            System.out.println("UPPER CASE IN THE GIVEN STRING ARE:");
            System.out.println(obj);
        }

    }

    public static void findLowerCase(String n) {
        ArrayList<Character> obb = new ArrayList<>();
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) >= 97 && n.charAt(i) <= 122) {
                obb.add(n.charAt(i));
            }
        }
        if (obb.size() == 0) {
            System.out.println("NO LOWER CAS FOUND IN THE GIVEN STRING");

        } else {
            System.out.println("LOWER CASE IN THE GIVEN STRING ARE:");
            System.out.println(obb);
        }

    }

    static int check(String n, char a) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n.length(); i++)
            if (n.charAt(i) == a) {
                count++;
            }
        return count;
    }

    public static void occurMethod(String n, char a) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        if (check(n, a) >= 1) {
            for (int j = 0; j < n.length(); j++) {
                if (n.charAt(j) == a)
                    count++;
            }
            System.out.println( a + " Occurs " + count + " times");
        } else {
            System.out.println("Enter a valid character: ");
            char b = scan.next().charAt(0);
            System.out.println(b);
            occurMethod(n, b);
        }


    }

    public static int findBlankSpace(String n) {
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 32) {
                count++;
            }
        }
        System.out.println(count);

        return count;
    }


    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        System.out.println("ENTER ANY STRING:");
        String st = checkString();
        int ct = countVowels(st);
        System.out.println("VOWELS COUNT IN THE GIVEN STRING IS:" + "" + ct);
        System.out.println();
        findUpperCase(st);
        System.out.println();
        findLowerCase(st);
        System.out.println();
        System.out.println("Enter a element to find the occurrence:");
        char a = std.next().charAt(0);
        occurMethod(st,a);
        System.out.println();
        System.out.println("BLANK SPACE OCCURRENCE IN THE GIVEN STRING IS:");
        findBlankSpace(st);


    }
}
