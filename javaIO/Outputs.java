import java.io.IOException;
import java.io.FileOutputStream;


public class Outputs {
    public static void main(String[] args) {
        FileOutputStream fos = null;

        try{
          fos = new FileOutputStream("emptyText.txt");
          String myMessage = "Hello ayoubMah" ;
          byte[] strToBytes = myMessage.getBytes(); // converting string to bytes

          fos.write(strToBytes);
          System.out.println("Message written to the file successfully");

        }catch(IOException e){
          System.err.println("An IOException was caught: " + e.getMessage());
          e.printStackTrace();
        }finally{
          if(fos != null){
            try{
              fos.close();
            }catch(IOException closeException){
              System.err.println("Error closing FileOutputStream: " + closeException.getMessage());
          }
        }
      }
    }

}
