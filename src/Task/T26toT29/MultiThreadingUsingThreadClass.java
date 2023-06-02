package Task.T26toT29;


import java.util.Scanner;

public class MultiThreadingUsingThreadClass extends Thread{
    int checkInt(){
        Scanner scan = new Scanner(System.in);
        int a=0;
        try{
            a=scan.nextInt();
            if(a<=0){
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println("ENTER A VALID NUMBER");
            return checkInt();
        }
        return a;
    }
    @Override
    public void run() {
        System.out.println("ENTER THE NO.OF ELEMENTS: ");
        int n=checkInt();
        System.out.println("ENTER THE MULTIPLE: ");
        int t=checkInt();
        for (int j = 1; j <=n ; j++) {

            System.out.println(j+"*"+t+"="+(j*t));
        }
    }
}

class ThreadMain {
    public static void main(String[] args) {
        MultiThreadingUsingThreadClass ob = new MultiThreadingUsingThreadClass();
        ob.start();
        System.out.println("WELCOME......");
    }
}
