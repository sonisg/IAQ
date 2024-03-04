package multhithreading;

public class ProducerConsumerProblem {
    public static void main(String[] args) throws InterruptedException {

        PC pc = new PC(4);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                try{
                    for(int i =0;i<5;i++){
                        pc.produce(i);
                        System.out.println("Produced: " + i);
                        Thread.sleep(1000);
                    }

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        int p = pc.consume();
                        System.out.println("Consumed " + p);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Completed");

    }
}

