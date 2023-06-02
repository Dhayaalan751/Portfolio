package Task.T5T6;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter character:");
        char cha = s.next().charAt(0);
        System.out.println(cha);
        System.out.println("Enter byte :");
        byte byt = s.nextByte();
        System.out.println(byt);
        System.out.println("Enter short:");
        short shor = s.nextShort();
        System.out.println(shor);
        System.out.println("Enter integer:");
        int integer = s.nextInt();
        System.out.println(integer);
        System.out.println("Enter long:");
        long lon = s.nextLong();
        long r = 0;
        System.out.println(lon);
        System.out.println("Enter float:");
        float floa = s.nextFloat();
        System.out.println(floa);
        System.out.println("Enter double:");
        double doubl = s.nextDouble();
        System.out.println(doubl);
        System.out.println();
        System.out.println();
        System.out.println("Type casting widening");
        int x = (int) shor;
        System.out.println(x+" short into integer");
        System.out.println("Type casting narrowing");
        int y =(int) doubl;
        System.out.println(y+" double into integer");
        System.out.println();
        System.out.println();
        System.out.println("Operators");
        System.out.println("Arithmetic operator");
        x=y+3;
        System.out.println(x+" Addition");
        x=y-3;
        System.out.println(x+" subtraction");
        x=y*3;
        System.out.println(x+" Multiplication");
        x=y/3;
        System.out.println(x+" division - quotient");
        x=y%3;
        System.out.println(x+" division - remainder");
        x++;
        System.out.println(x+" increment");
        y--;
        System.out.println(y+" decrement");
        System.out.println();
        System.out.println();
        System.out.println("Operator precedence");
        int result = 0;
        result = 5 + 2 * 3 - 1;
        System.out.println("5 + 2 * 3 - 1 = " +result);

        result = 5 + 4 / 2 + 6;
        System.out.println("5 + 4 / 2 + 6 = " +result);

        result = 3 + 6 / 2 * 3 - 1 + 2;
        System.out.println("3 + 6 / 2 * 3 - 1 + 2 = " +result);

        result = 6 / 2 * 3 * 2 / 3;
        System.out.println("6 / 2 * 3 * 2 / 3 = " +result);
        System.out.println(x);
        x=2;
        result = x++ + x++ * --x / x++ - --x + 3 >> 1 | 2;


        System.out.println("result = " +result);

    }
}
