package Task.T21;

import java.util.Scanner;

public class SalarySlip {
    float basicPay;
    float hra;
    float allowance;
    float ha;
    float da;
    float pf;
    float insurance;
    float tax;
    float lop;
    float checkfloat(){
        Scanner scan = new Scanner(System.in);
        float a=0;
        try{
            a = scan.nextFloat();
            if(a<=0){
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("Please enter valid number: ");
            return checkfloat();
        }
        return a;
    }
    void getBasicpay(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Basicpay: ");
        basicPay = checkfloat();
    }
    void getHra(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Hra: ");
        hra = checkfloat();
    }
    void getAllowance(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Allowance: ");
        allowance = checkfloat();
    }
    void getHa(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ha: ");
        ha = checkfloat();

    }
    void getDa(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter da: ");
        da = checkfloat();

    }
    void getPf(){
        System.out.println("Enter pf: ");
        Scanner scan = new Scanner(System.in);
        pf = checkfloat();
    }
    void getInsurance(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter insurance: ");
        insurance = checkfloat();
    }
    void getTax(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter tax: ");
        tax = checkfloat();
    }
    void getLop(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter lop: ");
        lop = checkfloat();
    }
    float getGrossAmount() {
        getBasicpay();
        getHra();
        getAllowance();
        getHa();
        getDa();
        return this.basicPay+this.hra+this.allowance+this.ha+this.da;

    }
    float findDeductionAmount(){
        Scanner scan = new Scanner(System.in);
        getPf();
        getInsurance();
        getTax();
        getLop();
        return this.pf+this.insurance+this.tax+this.lop;

    }

}
