import java.net.*;
import java.io.*;


public class client
{
    public static void main(String a[]) throws Exception
    {
        System.out.println("client application is running...");
        Socket s=new Socket("localhost",2100);

        System.out.println("client is waiting for server to accept the request");

      PrintStream ps=new PrintStream(s.getOutputStream());

      BufferReader br1=new BufferReader(new InputStreamREADER(s.getInputStream()));
        
      BufferReader br2 =new BufferReader(new InputStreamREADER(System.in));
  }   
    }
