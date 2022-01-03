import java.net.Socket;

public class ClientEx1 {
    public static void main(String arg[]){
		try{
        Socket sob=new Socket("127.0.0.1",5000);
        sob.close();
        				System.out.println("Requesting server to accept");

        }catch(Exception e){
				System.out.println(e);
		}
    }
}
