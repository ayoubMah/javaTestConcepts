import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {
  public static void main(String [] args){
    PrintWriter pw = null ;

    try{
      pw = new PrintWriter("emptyText.txt") ;
      pw.println("This the FirstLine Printed");
      pw.printf("%s , %d" , "Ayoub" , 22);
      pw.print(". This line in the same line") ;


      System.out.println("Text writed successfully") ;

    }catch(IOException e){
      System.err.println("Error to write " + e.getMessage());
      e.printStackTrace();

    }finally{
      if(pw != null){
        pw.close();
      }
    }
  }
}