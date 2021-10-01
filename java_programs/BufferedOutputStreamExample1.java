import java.io.*;

public class BufferedOutputStreamExample1{

	public static void main(String[] arg) throws Exception{

		FileOutputStream fos=new FileOutputStream("e://FileOutputStreamExample3.txt");

		BufferedOutputStream bos = new BufferedOutputStream(fos);

		String str="Welcome to MKPITS";

		byte[] b = str.getBytes();

		bos.write(b);

		bos.flush();

		bos.close();

		fos.close();

		System.out.println(" Success");

}

}