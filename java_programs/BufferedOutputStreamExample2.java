import java.io.*;
import java.util.*;

public class BufferedOutputStreamExample2{

	public static void main(String[] arg) throws Exception{

		FileOutputStream fos=new FileOutputStream("e://FileOutputStreamExample3.txt");

		BufferedOutputStream bos = new BufferedOutputStream(fos);

		Scanner s = new Scanner(System.in);

		System.out.println("Enter msg");

		String str="msg : ";

		 str+= s.nextLine();

		byte[] b = str.getBytes();

		bos.write(b);

		bos.flush();

		bos.close();

		fos.close();

		System.out.println(" Success");

}

}