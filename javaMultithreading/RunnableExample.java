import java.lang.InterruptedException;

public class RunnableExample {
  public static void main(String[] args) {
    System.out.println("Main thread started: " + Thread.currentThread().getName());

    RunableJava task1 = new RunableJava("Task-1");
    RunableJava task2 = new RunableJava("Task-2");

    Thread thread1 = new Thread(task1);
    Thread thread2 = new Thread(task2);

    // Start the threads
    thread1.start();
    thread2.start();

    System.out.println("Main thread continues to execute.");

    try {
        thread1.join();
        thread2.join();
    } catch (InterruptedException e) {
        System.err.println("Main thread was interrupted while waiting for threads to join.");
        Thread.currentThread().interrupt();
    }

    System.out.println("Main thread finished.");
  }
}