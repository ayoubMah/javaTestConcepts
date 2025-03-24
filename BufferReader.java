import java.io.BufferedReader ;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
  public static void main(String[] args){
    BufferedReader br = null ;

    try{
      br = new BufferedReader(new FileReader("text.txt"));
      String line ;

      while((line = br.readLine()) != null){
        System.out.println(line); //print each line
      }
      System.out.println("/nFinishing Reading File !");
    }catch(IOException e){
      System.err.println("Error Reading File"+ e.getMessage());
      e.printStackTrace() ;
    }finally{
      if(br != null){
        try{
          br.close();
        }catch(IOException ce){
          System.err.println("Error closing BufferReader" + ce.getMessage());
        }
      }
    }

  }

}
