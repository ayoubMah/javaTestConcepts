public class NumberPrinterRunnable implements Runnable {


  @Override
  public void run() {
    for(int i = 0 ; i < 10 ; i++) {
      System.out.println("Number: " + i + " is printed by thread: " + Thread.currentThread().getName());
    }
  }
}
