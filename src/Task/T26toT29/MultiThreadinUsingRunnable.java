package Task.T26toT29;

import java.util.Scanner;

public class MultiThreadinUsingRunnable implements Runnable {
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
//        System.out.println("ENTER THE NO.OF ELEMENTS: ");
//        int n=checkInt();
//        System.out.println("ENTER THE MULTIPLE: ");
//        int t=checkInt();
        for (int j = 1; j <=10 ; j++) {

            System.out.println(j+"*"+10+"="+(j*10));
        }
    }
}
class MultiRunnableMain{
    public static void main(String[] args) {
        MultiThreadinUsingRunnable ob = new MultiThreadinUsingRunnable();
        Thread obj = new Thread(ob);
        obj.start();
        Thread object = new Thread(ob);
        object.start();
        System.out.println("LOADING.......");
    }
}
