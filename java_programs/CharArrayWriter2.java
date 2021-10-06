import java.io.CharArrayWriter;

import java.io.FileWriter;

import java.util.*;

public class CharArrayWriter2{

	public static void main(String[] arg)throws Exception{

		CharArrayWriter caw=new CharArrayWriter();

		FileWriter f1=new FileWriter("e:\\e.txt");
		FileWriter f2=new FileWriter("e:\\f.txt");
		FileWriter f3=new FileWriter("e:\\g.txt");
		FileWriter f4=new FileWriter("e:\\h.txt");

		Scanner s=new Scanner(System.in);

		System.out.println("Enter text");

		String str="Text : ";

		str+= s.nextLine();

         byte[] b=str.getBytes();

		caw.write(str);

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

