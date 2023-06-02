package Task.T21;

public class Employee extends SalarySlip {
    String name;
    String id;
    String designation;
    String address;
    float grosspay;
    float netpay;
    String ctc;

    void setdetails(String name, String id, String designation, String address) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.address = address;
        this.grosspay = getGrossAmount();
        this.netpay = net();
        this.ctc = ctc();

    }
    float net() {
        float net = this.grosspay - findDeductionAmount();
        return net;
    }

    String ctc() {
        float ctc = this.grosspay * 12;
        if (ctc < 500000) {
            return "NO";
        }
        return "YES";
    }

    void display() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("%1s%15s%15s%15s%15s%15s%15s", this.name, this.id, this.designation, this.address, this.grosspay,this.netpay, this.ctc());
        System.out.println();

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
    }
}
