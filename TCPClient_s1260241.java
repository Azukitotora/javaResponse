import java.io.*;
import java.net.*;

class TCPClient_s1260241 {
	public static void main(String argv[]) throws Exception
    {
        String sentence;
        String modifiedSentence;
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("localhost", 6789);
        DataOutputStream outToServer =
        new DataOutputStream(clientSocket.getOutputStream());
        System.out.println("If you input one word below, returns THANKS YOU for that country");
        System.out.println("Japan Russia China Korea Spain Italy"); 
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        System.out.println("Input ↓ "); 
        sentence = inFromUser.readLine();
        outToServer.writeBytes(sentence + '\n');
        modifiedSentence = inFromServer.readLine();
        System.out.println("FROM SERVER: " + modifiedSentence); 
        clientSocket.close();
          }
}
