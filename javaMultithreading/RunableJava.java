import java.lang.InterruptedException;


public class RunableJava implements Runnable {
  private String myTask;
  public RunableJava(String task) {
    myTask = task;
  }

  @Override
  public void run() {
    System.out.println("Runnable Task: " + myTask + " is running in thread :" + Thread.currentThread().getName());

    try {
      Thread.sleep(2000);
    }catch(InterruptedException e){
      Thread.currentThread().interrupt();
      System.out.println("Thread " + myTask +" was interrupted");

      return;
    }
    System.out.println("Thread " + myTask +" finished");
  }
}
