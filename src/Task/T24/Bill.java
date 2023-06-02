package Task.T24;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface Bill {
    double billFormula();
}

class BillGenerate implements Bill {
    String name;
    String uniqueID;
    int units;
    double charges;
    Date dt = new Date();
    void setDetails(String name, String uniqueID, int units) {
        this.name = name;
        this.uniqueID = uniqueID;
        this.units = units;
        this.charges = billFormula();
    }

    double categoryOne() {
        return (this.units - 100) * 1.5;
    }

    double categoryTwo() {
        return (100 * 2) + (this.units - 200) * 3.0;
    }

    double categoryThree() {
        return (100*3.5) + (300*4.6) + (this.units - 500) * 6.6;
    }

    @Override
    public double billFormula() {
        if (this.units < 100) {
            return charges = 0;
        } else if (this.units < 200) {
            charges = categoryOne();
            return charges;
        } else if (this.units < 500) {
            charges = categoryTwo();
            return charges;
        } else {
            charges = categoryThree();
            return charges;
        }
    }

    void display() {
        SimpleDateFormat formatTime = new SimpleDateFormat("dd-MMM-yyyy hh.mm aa");
        Date date = new Date();
        String time = formatTime.format(date);
        System.out.println("\t\t\t\t--------------------INVOICE--------------------");
        System.out.println("\t\t\t\t\t\t " + "  " + "TAMILNADU ELECTRICITY BILL");
        System.out.println("\n\t\t\t\t\t " + "  " + "DATE: "+time);
        System.out.println("\n\t\t\t\t    NAME: " +this.name);
        System.out.println("\t\t\t\t\tID: " +this.uniqueID);
        System.out.println("\t\t\t\t\tUNITS USED: " +this.units);
        System.out.println("\n\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " +this.charges);
        System.out.println("\t\t\t\t-------------------Thank You -------------------");


    }
}
