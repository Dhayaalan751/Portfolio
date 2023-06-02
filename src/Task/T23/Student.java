package Task.T23;

public class Student  {
    String name;
    String reg;
    String college;
    String degree;
    int year;
    String bank;
    double principle;
    int cOD;
    double emi;
    void setDetails(String name,String reg,String college,String degree,int year,String bank,int principle){
        this.name = name;
        this.reg = reg;
        this.college = college;
        this.degree = degree;
        this.cOD = findCod();
        this.year = year;
        this.bank = bank;
        this.principle = principle;
        this.emi = doubleEmi();

    }
    double doubleEmi(){
        if(this.bank.equalsIgnoreCase("SBI")) {
            Sbia b = new Sbia();
            emi = (this.principle*Math.pow(1+ b.rOIa(),(this.year-this.cOD)));
            return emi;
        } else if (this.bank.equalsIgnoreCase("CENTRAL")) {
            Centrala b = new Centrala();
            emi =(this.principle*Math.pow(1+ b.rOIa(),(this.year-this.cOD)));
            return emi;
        } else if (this.bank.equalsIgnoreCase("INDIAN")) {
            Indiana b = new Indiana();
            emi = (this.principle*Math.pow(1+ b.rOIa(),(this.year-this.cOD)));
            return emi;

        } else {
            Icicia b = new Icicia();
            emi = (this.principle*Math.pow(1+ b.rOIa(),(this.year-this.cOD)));
            return emi;
        }

    }
    int findCod() {
        if (this.degree.equalsIgnoreCase("B.E")) {
            return 4;
        } else if (this.degree.equalsIgnoreCase("B.Sc")) {
            return 3;
        } else if (this.degree.equalsIgnoreCase("M.Sc")) {
            return 2;
        }else {
            return 5;
        }
    }


    void display(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("%-15s%-15s%-20s%-15s%-15s%-15s%-15s", "NAME", "REGISTER NO","COLLEGE","DEGREE","COURSE","PRINCIPLE","AMOUNT TO BE PAID");
        System.out.println();

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s%-15s%-20s%-15s%-15s%-15s%-15s", this.name, this.reg,this.college,this.degree,this.cOD, this.principle, this.emi);
        System.out.println();

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
    }
}