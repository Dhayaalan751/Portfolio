package Task.T22;


public class Employee {
    String name;
    String id;
    String deg;
    String bank;
    double maxAmt;
    double basicPay;
    int year;
    double emi;

    void setDetails(String name,String id,String deg,String bank,double basicPay,int year){
        this.name = name;
        this.id = id;
        this.deg = deg;
        this.bank = bank;
        this.basicPay = basicPay;
        this.maxAmt = getMaxAmt();
        this.year = year;
        this.emi = doubleEmi();

    }
    double doubleEmi(){
        Sbi s;
        Central c;
        Indian i;
        Icici iC;
        if(this.bank.equalsIgnoreCase("SBI")) {
            s = new Sbi();
            emi = (this.maxAmt + (s.rOI() * this.maxAmt)) / (this.year * 12);
            return emi;
        } else if (this.bank.equalsIgnoreCase("CENTRAL")) {
            c = new Central();
            emi = (this.maxAmt + (c.rOI() * this.maxAmt)) / (this.year * 12);
            return emi;
        } else if (this.bank.equalsIgnoreCase("INDIAN")) {
            i = new Indian();
            emi = (this.maxAmt + (i.rOI() * this.maxAmt)) / (this.year * 12);
            return emi;

        } else {
           iC = new Icici();
            emi = (this.maxAmt + (iC.rOI() * this.maxAmt)) / (this.year * 12);
            return emi;
        }

    }
    double getMaxAmt(){
        if(bank.equals("INDIAN") || bank.equals("CENTRAl")) {
            return this.basicPay * 12;

        }
        else{
            return this.basicPay * 12 * 5;

        }
    }
    void display(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("%-15s%-15s%-20s%-15s%-15s%-15s%-15s", "NAME", "ID","DESIGNATION","BANK","AMOUNT","YEAR","EMI");
        System.out.println();

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s%-15s%-20s%-15s%-15s%-15s%-15s", this.name, this.id,this.deg,this.bank, this.getMaxAmt(), this.year, this.emi);
        System.out.println();

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
    }


}
