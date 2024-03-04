package multhithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    private ExecutorService executorService;

    public ThreadPool(int threadSize) {
        this.executorService = Executors.newCachedThreadPool();
    }

    public void submitTask(Runnable task){
        executorService.submit(task);
    }

    public void shutdown(){
        executorService.shutdown();
    }


    public static void main(String args[]){
        ThreadPool threadPool = new ThreadPool(3);

        for(int i =0;i<5;i++){
            int taskId =i;
            threadPool.submitTask(()->{
                System.out.println("Task " + taskId + " started");
                try {
                    Thread.sleep(2000);  // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + taskId + " completed");
            });
        }

        threadPool.shutdown();

    }

}
