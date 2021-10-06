import java.io.CharArrayWriter;

import java.io.FileWriter;

public class CharArrayWriter1{

	public static void main(String[] arg)throws Exception{

		CharArrayWriter caw=new CharArrayWriter();

		FileWriter f1=new FileWriter("e:\\e.txt");
		FileWriter f2=new FileWriter("e:\\f.txt");
		FileWriter f3=new FileWriter("e:\\g.txt");
		FileWriter f4=new FileWriter("e:\\h.txt");

		caw.write("Welcome to mkpits");

		caw.writeTo(f1);
		caw.writeTo(f2);
		caw.writeTo(f3);
		caw.writeTo(f4);

		f1.close();
		f2.close();
		f3.close();
		f4.close();

		System.out.println("Success");

	}

}

