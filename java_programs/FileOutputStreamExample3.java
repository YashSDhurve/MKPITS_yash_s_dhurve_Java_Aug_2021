import java.io.*;
import java.util.*;

class FileOutputStreamExample3{

	public static void main(String[] arg){

		try{

		FileOutputStream fos=new FileOutputStream("e://FileOutputStreamExample3.txt");

		Scanner scan=new Scanner(System.in);
		String str="name :";
		str+=scan.nextLine();

		byte[] arr= str.getBytes();

		fos.write(arr);
		fos.close();

		System.out.println("name written sucessfully in file");

	     }

	     catch(Exception ee){
			 System.out.println(ee.toString());
			 }

		 }
	 }

