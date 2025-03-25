public class MainTh {
    public static void main(String[] args) {
        AlphabetPrinterThread task1 = new AlphabetPrinterThread() ;
        NumberPrinterRunnable task2 = new NumberPrinterRunnable() ;

        Thread thread1 = new Thread(task1) ;
        Thread thread2 = new Thread(task2) ;

        thread1.start();
        thread2.start();

        try{
            //thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            System.err.println("Main thread was interrupted while waiting for threads to join") ;

            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread finished.");

    }
}
