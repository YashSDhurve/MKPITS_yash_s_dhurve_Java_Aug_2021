import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkingEx1 {
    public static void main(String arg[]) throws UnknownHostException {
        InetAddress ob= InetAddress.getLocalHost();
        System.out.println(ob);
        System.out.println(ob.getHostName());
        System.out.println(ob.getHostAddress());
        System.out.println(ob.getByName("www.google.com"));
        System.out.println(ob.getLoopbackAddress());
        System.out.println(ob.hashCode());


    }
}