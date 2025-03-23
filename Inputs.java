import java.io.FileInputStream;
import java.io.IOException;

public class Inputs {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try{
          fis = new FileInputStream("text.txt");
          int byteData ;

          while((byteData = fis.read()) != -1){
            System.out.print((char)byteData);
          }
          System.out.println("\nFinish reading file");
        }catch (IOException e){
          System.err.println("Error reading file" + e.getMessage());
          e.printStackTrace();

        }finally{
          try{
            if(fis != null){
              fis.close();
            }
          }catch(IOException closeException){
            System.err.println("Error closing file" + closeException.getMessage());
          }
        }

    }
}

