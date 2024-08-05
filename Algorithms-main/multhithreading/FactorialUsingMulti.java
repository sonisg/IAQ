package multhithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Step 1: FactorialTask class
class FactorialTask implements Runnable {
    private int number;
    private long result;

    public FactorialTask(int number) {
        this.number = number;
    }

    public long getResult() {
        return result;
    }

    @Override
    public void run() {
        result = factorial(number);
    }

    private long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

// Step 2: FactorialCalculator class
class FactorialCalculator {
    private ExecutorService executor;

    public FactorialCalculator(int numThreads) {
        executor = Executors.newFixedThreadPool(numThreads);
    }

    public long calculateFactorial(int number) throws InterruptedException {
        FactorialTask task = new FactorialTask(number);
        executor.submit(task);
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        return task.getResult();
    }
}

// Step 3: Main class to test
public class FactorialUsingMulti {
    public static void main(String[] args) {
        int numThreads = Runtime.getRuntime().availableProcessors(); // Number of available processors
        FactorialCalculator calculator = new FactorialCalculator(numThreads);

        int number = 10; // Number to calculate factorial
        try {
            long result = calculator.calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
