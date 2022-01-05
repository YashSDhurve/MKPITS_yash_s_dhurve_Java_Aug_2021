import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatServerEx4 {
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(6666);
            System.out.println("Waiting for Client to Connect... ");

            Socket so=ss.accept();//establishes connection
            System.out.println("Client Connected.");
for(; ;){
            DataInputStream dis=new DataInputStream(so.getInputStream());
            String  str=(String)dis.readUTF();//readUTF --> Converted Bytes to String
            System.out.println("From Client : "+str);

            System.out.print("Type here : ");

            DataOutputStream dout=new DataOutputStream(so.getOutputStream());

            Scanner Msg = new Scanner(System.in);
            String MsgFromServer =Msg.nextLine();

            dout.writeUTF(MsgFromServer);
            if(MsgFromServer.equals("bye")){
				System.exit(0);
				}


            //ss.close();
		}

        }catch(Exception e){System.out.println(e);}
}
}