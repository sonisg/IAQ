package multhithreading;

public class thread3 extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000); // Simulate some work
                System.out.println("Thread 1 - Number: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }}
