import java.io.*; 
import java.net.*; 

class TCPServer_s1260241 {
	public static void main(String argv[]) throws Exception 
    {
      String clientSentence; 
      String capitalizedSentence; 
      ServerSocket welcomeSocket = new ServerSocket(6789); 
      System.out.println("Server successfully started. "); 
      System.out.println("Server successfully."); 
      while(true) { 
           System.out.println("Server is running now!"); 
           Socket connectionSocket = welcomeSocket.accept(); 
           BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream())); 
           DataOutputStream  outToClient = new DataOutputStream(connectionSocket.getOutputStream()); 
           clientSentence = inFromClient.readLine(); 
           System.out.println(clientSentence); 
           //capitalizedSentence = clientSentence.toUpperCase() + '\n'; 
           String Japan = "Japan";
		       String China = "China";
           String Russia = "Russia";
		       String Korea = "Korea";
           String Spain = "Spain";
           String Italy = "Italy";
           if(clientSentence.equals(Japan)){
             capitalizedSentence = "Arigato"+ '\n';
           }else if(clientSentence.equals(Russia)){
             capitalizedSentence = "Spa Sheba"+ '\n';
           }else if(clientSentence.equals(China)){
             capitalizedSentence = "Shay Shey"+ '\n';
           }else if(clientSentence.equals(Korea)){
             capitalizedSentence = "Kamsa Hamnida"+ '\n';
           }else if(clientSentence.equals(Spain)){
             capitalizedSentence = "Gracias"+ '\n';
           }else if(clientSentence.equals(Italy)){
             capitalizedSentence = "Grazie"+ '\n';
           }else{
             capitalizedSentence = "thank you!"+ '\n';
           }
           outToClient.writeBytes(capitalizedSentence);
      }
    }
}