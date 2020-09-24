
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
// import java.time.LocalDateTime;

public class Client {
  private static final int PORT = 8096;

  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("localhost", PORT);
    System.out.println("client started");
    String request = "This is a word\nAnd this is the second line\n";
    sendRequest(socket, request);
    readResponse(socket);
    // socket.close();
  }

  private static void sendRequest(Socket socket, String request) throws IOException {
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
    out.println(request);
    System.out.println("Request Sent:");
    System.out.println(request);
    System.out.println("");
  }

  private static void readResponse(Socket socket) throws IOException {
    BufferedReader response = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    String line;
    while ((line = response.readLine()) != null) {
      System.out.println("** " + line);
    }
  }
}