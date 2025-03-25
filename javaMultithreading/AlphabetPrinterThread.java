public class AlphabetPrinterThread extends Thread {
  @Override
  public void run() {
    for(char c = 'A' ; c < 'J' ; c ++){
      System.out.println("Character: " + c + " is printed by thread: " + Thread.currentThread().getName());
    }
  }

}
