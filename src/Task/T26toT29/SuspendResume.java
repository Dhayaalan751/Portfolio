package Task.T26toT29;

public class SuspendResume extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                sleep(500);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SuspendResume t1 = new SuspendResume();
        SuspendResume t2 = new SuspendResume();
        SuspendResume t3 = new SuspendResume();
        t1.start();
        t2.start();
        t2.suspend();
        t3.start();
        t2.resume();

    }
}
