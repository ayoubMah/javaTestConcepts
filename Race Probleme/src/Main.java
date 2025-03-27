public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter sharedCounter = new Counter() ;

        IncremenrTask task1 = new IncremenrTask(sharedCounter);
        IncremenrTask task2 = new IncremenrTask(sharedCounter);

        Thread th1 = new Thread(task1);
        Thread th2 = new Thread(task2);

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println("Final Counter Value: " + sharedCounter.getCount());
    }
}