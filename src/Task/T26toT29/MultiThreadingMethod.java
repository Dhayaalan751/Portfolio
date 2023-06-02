package Task.T26toT29;

public class MultiThreadingMethod implements Runnable {
    @Override
    public void run() {
        System.out.println("RUN METHOD IS IMPLEMENTED");

    }
    public void show(){
        System.out.println("Dhayaalan");
    }
}
class Multi1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(1000);

            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());

        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon thread work ");
        }else{
            System.out.println("user thread work ");
        }
    }

}

class MainMulti{
    public static void main(String[] args) {
        MultiThreadingMethod obj = new MultiThreadingMethod();
        Thread t1 = new Thread(obj);

        System.out.println("before starting thread isAlive: "+t1.isAlive());
        t1.start();
        System.out.println("after starting thread isAlive: "+t1.isAlive());
        Multi1 ob = new Multi1();

        Multi1 ob1 = new Multi1();

        Multi1 t = new Multi1();

        ob.start();
        try{ob.join();}catch (Exception e){System.out.println(e);}
        ob1.start();
//        ob.start();
        System.out.println("ob thread priority: "+ob.getPriority());
        ob.setPriority(Thread.MIN_PRIORITY);
        ob1.setPriority(4);
        ob.setName("Almighty push ");
        System.out.println(""+ob.getName());
        System.out.println("Id of t1: "+t1.getId());
        for (int i=0; i<3; i++) {
            ob1.yield();
            System.out.println(Thread.currentThread().getName() + " in control");
        }
        t.setDaemon(true);



    }

}

