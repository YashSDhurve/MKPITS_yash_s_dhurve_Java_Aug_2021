import java.io.*;
import java.util.*;

class FileOutputStreamExample4{

	public static void main(String[] arg){

		try{

			FileOutputStream fos=new FileOutputStream("e://FileOutputStreamExamples4.txt");

			Scanner s = new Scanner(System.in);

			System.out.println("Enter Address");

			String str="Address : ";

			 str+= s.nextLine();

			byte[] b= str.getBytes();

			fos.write(b);
			fos.close();

			System.out.println("Address written Sucessfully in the file");

		}

		catch(Exception ee){
			System.out.println(ee.toString());
			}
		}
	}

