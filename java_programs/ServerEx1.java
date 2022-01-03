import java.net.ServerSocket;

public class ServerEx1 {
    public static void main(String arg[]){
		try{
        ServerSocket ob=new ServerSocket(5000);
        System.out.println("Waiting for the client");
        ob.accept();
         System.out.println("Client Connected Successfully");
	}catch(Exception e){
		System.out.println(e);
		}

    }

}
