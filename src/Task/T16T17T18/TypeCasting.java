package Task.T16T17T18;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte b = scan.nextByte();
        System.out.println("Widening casting :");
        short c = b;
        System.out.println(c);
//        char d = 'b';
//        System.out.println(d);
        int e = b;
        System.out.println(e);
        long f = b;
        System.out.println(f);
        float g = b;
        System.out.println(g);
        double h = b;
        System.out.println(h);
        int a = scan.nextInt();
        short ct =(short)a;
        System.out.println(ct);
//        char dt = (char) 'b';
//        System.out.println(dt);
        int et = (int) a;
        System.out.println(et);
        long ft = (long) a;
        System.out.println(ft);
        float gt = (float)a;
        System.out.println(gt);
        double ht = (double) a;
        System.out.println(ht);





    }
}
