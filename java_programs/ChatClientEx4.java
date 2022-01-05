import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClientEx4 {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("localhost",6666);
            System.out.println("Requesting the Server to accept...");

               System.out.println("Server Connected.\n");
for(;;){
               System.out.print("Type here : ");

           DataOutputStream dout=new DataOutputStream(s.getOutputStream());

            Scanner msg = new Scanner(System.in);
            String MsgFromClient =msg.nextLine();
            dout.writeUTF(MsgFromClient);//writeUTF --> Converted String to Bytes

            DataInputStream dis=new DataInputStream(s.getInputStream());
            String  str=(String)dis.readUTF();//readUTF --> Converted Bytes to String
            System.out.println("From Server : "+str);

           if(MsgFromClient.equals("bye")){
							System.exit(0);
				         }


          // s.close();
	 }

        }catch(Exception e){System.out.println(e);}
}
}