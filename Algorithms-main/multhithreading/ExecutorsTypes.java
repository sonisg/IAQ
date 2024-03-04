package multhithreading;

import java.util.concurrent.*;

public class ExecutorsTypes {

    public  static void main(String[] args){
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
//        scheduledExecutorService.schedule(()->{
//            System.out.println("Hello");
//        }, 5, TimeUnit.SECONDS);
        Future<String> fut= scheduledExecutorService.schedule(()->{
            return "Callable";
        }, 2, TimeUnit.SECONDS);

        try{
            System.out.println(fut.get());
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
