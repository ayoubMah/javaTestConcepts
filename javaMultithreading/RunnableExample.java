import java.lang.InterruptedException;
import RunableJava;
public class RunnableExample {
  public static void main(String [] args){
    System.out.print("Main Thread Started" + Thread().currentThread().getName());


    // create a Runnable Tasks
    RunnableJava task1 = new RunnableJava("task1") ;
    RunnableJava task2 = new RunnableJava("task2") ;

    // create Thread Obj
    Thread th1 = new Thread(task1) ;
    Thread th2 = new Thread(task2) ;

    // start threads
    th1.start() ;
    th2.start() ;

    System.out.println("Main Thread continues run");

    try{
      th1.join();
      th2.join();
    }catch(InterruptedException e){
      System.err.println("Main thread was interrupted while waiting for threads to join");
      Thread.currentThread().interrupt();

    }

    System.out.println("Main Thread finished");

  }
}