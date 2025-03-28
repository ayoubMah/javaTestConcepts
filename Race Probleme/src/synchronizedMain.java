import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class synchronizedMain {

    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}
