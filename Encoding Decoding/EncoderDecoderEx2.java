import java.util.Base64;

class encDec1{

    byte[] encFunc(String password){

        byte[] encode = Base64.getEncoder().encode(password.getBytes());
        return encode;

    }

     String decFunc(byte[] encode ){

        byte[] decode= Base64.getDecoder().decode(encode);

        return new String(decode);

    }

}

public class EncoderDecoderEx2 {
    public static void main(String arg[]) {

        String password="yash1234";

        encDec1 obj = new encDec1();

        byte[] encFunc = obj.encFunc(password);
        String decFunc = obj.decFunc(encFunc);

        System.out.println(decFunc);


    }
}
