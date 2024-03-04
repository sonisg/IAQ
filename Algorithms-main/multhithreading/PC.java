package multhithreading;

import java.util.LinkedList;
import java.util.Queue;

public class PC{

    int cap;
    private Queue<Integer> q;

    public PC(int cap) {
        this.cap = cap;
        this.q = new LinkedList<>();
    }

    public boolean produce(int i) throws InterruptedException {
        synchronized (q) {
            while (q.size() == cap) {
                q.wait();
            }
            q.add(i);
            q.notifyAll();

            return true;
        }
    }

    public int consume() throws InterruptedException {
        synchronized (q) {
            while(q.size() == 0) {
                q.wait();
            }
            int s = q.poll();
            q.notifyAll();
            return s;
        }
    }
}
