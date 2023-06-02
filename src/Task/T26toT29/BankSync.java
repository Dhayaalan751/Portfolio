package Task.T26toT29;

public class BankSync extends Thread{
    int balance = 0;
    int a = 0;
    int b=0;

    synchronized void deposit() throws InterruptedException {
        a = 2000;
        balance();
        notify();
    }
    void balance(){
        System.out.println("AVAILABLE BALANCE IS " + balance);
        System.out.println("YOU DEPOSITED " + a);
        balance = balance + a;
        System.out.println("AFTER DEPOSITED BALANCE " + balance);

    }


    synchronized void withdrawl() throws InterruptedException{

        b = 2000;
        if(b>=balance){
            System.out.println("Your account doesn't have enough balance ..WAITING for deposition...............");
            wait();
        }else {
            balanceWi();
        }

    }
    void balanceWi(){

        System.out.println("AVAILABLE BALANCE IS " + balance);
        System.out.println("YOU WITHDRAWL " + b);
        balance = balance - b;
        System.out.println("AFTER WITHDRAWL BALANCE " + balance);

    }


    @Override
    public void run() {
        try {
            deposit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            withdrawl();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class MainSync{
    public static void main(String[] args) {
        BankSync ob = new BankSync();
        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(ob);
        Thread t3 = new Thread(ob);
        Thread t4 = new Thread(ob);
        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//
    }

}
