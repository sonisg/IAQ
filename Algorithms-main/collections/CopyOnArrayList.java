package collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopyOnArrayList {

    public static void main(String args[]) {
        List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        // Add elements to the CopyOnWriteArrayLis


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(()->{
            for(int i =0;i<1000;i++){
                copyOnWriteArrayList.add(i);
            }
        });
        executorService.submit(()->{
            for(int i =1000;i<2000;i++){
                copyOnWriteArrayList.add(i);
            }
        });

        executorService.shutdown();

        while (!executorService.isTerminated()) {}

        System.out.println("Size of ArrayList: " + copyOnWriteArrayList.size());

    }
}
