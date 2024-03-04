package multhithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableTask implements Callable<String> {

    private final int taskId;

    public CallableTask(int taskId) {
        this.taskId = taskId;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "Task " + taskId + " completed";
    }

    public static void main(String args[]){
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<String>> futureList = new ArrayList<>();

        for(int i =1;i<=6;i++){
            Callable<String> callableTask = new CallableTask(i);
            Future<String> future = executorService.submit(callableTask);
            futureList.add(future);
        }

        for (Future<String> future : futureList) {
            try {
                // Blocking call to get the result (waits if necessary)
                String result = future.get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        // Shutdown the ExecutorService
        executorService.shutdown();

    }
}
