package collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        // Put some key-value pairs into the map
        concurrentHashMap.put("one", 1);
        concurrentHashMap.put("two", 2);
        concurrentHashMap.put("three", 3);

        // Create two threads to iterate and modify the map concurrently
        Thread thread1 = new Thread(() -> {
            for (String key : concurrentHashMap.keySet()) {
                System.out.println("Thread 1 - Key: " + key + ", Value: " + concurrentHashMap.get(key));
                try {
                    Thread.sleep(100); // Simulate some processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            concurrentHashMap.put("four", 4);
            System.out.println("Thread 2 - Added key 'four'");
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final contents of the ConcurrentHashMap
        System.out.println("Final contents of ConcurrentHashMap: " + concurrentHashMap);
    }
}
