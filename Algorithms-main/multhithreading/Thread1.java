package multhithreading;

public class Thread1 implements Runnable
{
    @Override
    public void run() {
        for(int i =0;i<5;i++){
            try{
                Thread.sleep(100);
                System.out.println("Thread1 "+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
