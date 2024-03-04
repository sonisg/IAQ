package multhithreading;

public class Thread2 implements Runnable
{
    @Override
    public void run() {
        for(int i =5;i>0;i--){
            try{
                Thread.sleep(100);
                System.out.println("Thread2 " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
