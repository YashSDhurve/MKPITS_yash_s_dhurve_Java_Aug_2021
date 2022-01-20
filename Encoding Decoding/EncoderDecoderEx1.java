import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncoderDecoderEx1 {
    public static void main(String arg[]){

        String pass="yash@0012";

        byte[] encode = Base64.getEncoder().encode(pass.getBytes());

        System.out.println(encode);

        byte[] decode= Base64.getDecoder().decode(encode);

        System.out.println(new String(decode));

    }
}
