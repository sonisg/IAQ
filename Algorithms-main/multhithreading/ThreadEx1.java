package multhithreading;

public class ThreadEx1 {

    public static void main(String args[]){
        Thread th1 = new Thread(new Thread1());
        Thread th2 = new Thread(new Thread2());
        thread3 th3 = new thread3();
        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished.");
    }
}

