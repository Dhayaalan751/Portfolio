package Task.T16T17T18;

import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        Integer aw = a;
        System.out.println(aw);
        float b = scan.nextFloat();
        Float bf = Float.valueOf(b);
        System.out.println(bf);
        double c = scan.nextDouble();
        String sw = String.valueOf(c);
        double dop = scan.nextDouble();
        System.out.println(sw);
        Byte conv = Byte.valueOf(String.valueOf(dop));
        System.out.println(conv);
    }
}
