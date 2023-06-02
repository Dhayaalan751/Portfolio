package Task.T19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormat{
    static String stringVal(String a){
        Scanner scan = new Scanner(System.in);
        while(!(a).matches("[0-9]{0,10}")){
            System.out.println("Invalid! please Re-Enter");
            System.out.println();
            System.out.println("enter Long value");
            a = scan.nextLine();
            if((a).matches("[0-9]{0,10}")){
                System.out.println("a:" + a);
                break;
            }
        }
        return a;
    }
    public static void main(String[] args)
    {

        LocalDateTime myLdt = LocalDateTime.now();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Long value: ");
        String a = stringVal(scan.nextLine());
        Long lo = Long.parseLong(a);
        Date d = new Date(lo);
        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR,1);
        Date tomorrow = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR,-2);
        Date yesterday = calendar.getTime();
        System.out.println("Yesterday : " +yesterday);
        System.out.println("Today : " +today);
        System.out.println("Tomorrow : " +tomorrow);

        DateTimeFormatter Dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter Dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter Dtf2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DateTimeFormatter Dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss-ns");
        DateTimeFormatter Dtf4 = DateTimeFormatter.ofPattern("MMM dd,yyy");
        DateTimeFormatter Dtf5 = DateTimeFormatter.ofPattern("HH:MM:SS");

        String FormattedDatetime = myLdt.format(Dtf);
        String FormattedDatetime1 = myLdt.format(Dtf1);
        String FormattedDatetime2 = myLdt.format(Dtf2);
        String FormattedDatetime3 = myLdt.format(Dtf3);
        String FormattedDatetime4 = myLdt.format(Dtf4);
        String FormattedDatetime5 = myLdt.format(Dtf5);


        System.out.println("Current Date and Time : " +myLdt);
        System.out.println("yyyy-MM-dd : " +FormattedDatetime);
        System.out.println("dd-MM-yyyy : " +FormattedDatetime1);
        System.out.println("MM-dd-yyyy : " +FormattedDatetime2);
        System.out.println("yyyy-MM-dd HH-mm-ss-ns : " +FormattedDatetime3);
        System.out.println("MMMM dd,yyy : " +FormattedDatetime4);
        System.out.println("Long value Date format : " +d);
        System.out.println("UTC TIME FORMAT : " +FormattedDatetime5);


    }

}
