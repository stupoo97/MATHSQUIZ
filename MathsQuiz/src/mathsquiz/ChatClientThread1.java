package mathsquiz;
//Source:
//  Creating a simple Chat Client1/Server Solution 
//  http://pirate.shu.edu/~wachsmut/Teaching/CSAS2214/Virtual/Lectures/chat-client-server.html

import java.net.*;
import java.io.*;

public class ChatClientThread1 extends Thread
{

    private Socket socket = null;
    private MathsQuiz client1 = null;
    private DataInputStream streamIn = null;
    private DataOutputStream console = null;
    private String serverName = "localhost";
    private int serverPort = 4444;

    public ChatClientThread1(MathsQuiz _teacher1, Socket _socket)
    {
        client1 = _teacher1;
        socket = _socket;
        open();
        start();
    }

    
    public void open()
    {
        try
        {
            streamIn = new DataInputStream(socket.getInputStream());
        }
        catch (IOException ioe)
        {
            System.out.println("Error getting input stream: " + ioe);
            //client1.stop();
            client1.close();
        }
    }

    public void close()
    {
        try
        {
            if (streamIn != null)
            {
                streamIn.close();
            }
        }
        catch (IOException ioe)
        {
            System.out.println("Error closing input stream: " + ioe);
        }
    }

    public void run()
    {
        while (true)
        {
            try
            {
                client1.handle(streamIn.readUTF());
            }
            catch (IOException ioe)
            {
                System.out.println("Listening error: " + ioe.getMessage());
                //client1.stop();
                client1.close();
            }
        }
    }
}
