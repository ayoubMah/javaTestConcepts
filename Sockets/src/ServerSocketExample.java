import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketExample {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            int portNumber = 12345;
            serverSocket = new ServerSocket(portNumber);
            System.out.println("Server is listening on port " + portNumber);
        } catch (IOException e) {
            System.err.println("Couldn't listing on the port");
            e.getMessage() ;
            e.getStackTrace();
        }finally {
            if (serverSocket != null){
                try {
                    serverSocket.close();
                }catch (IOException exception){
                    System.err.println("Error closing ServerSocket: " + exception.getMessage());
                }
            }
        }
    }
}