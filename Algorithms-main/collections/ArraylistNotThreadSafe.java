package collections;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArraylistNotThreadSafe {
    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<>();


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(()->{
            for(int i =0;i<1000;i++){
                a.add(i);
            }
        });
        executorService.submit(()->{
            for(int i =1000;i<2000;i++){
                a.add(i);
            }
        });

        executorService.shutdown();

        while (!executorService.isTerminated()) {}

        System.out.println("Size of ArrayList: " + a.size());

    }
}
