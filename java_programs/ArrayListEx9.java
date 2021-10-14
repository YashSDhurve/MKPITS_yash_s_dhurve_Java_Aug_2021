//Serialization ans Deserialization
import java.util.*;
import java.io.*;

class ArrayListEx9{
	public static void main(String[] arg){
		ArrayList<String> al =new ArrayList<String>();

		al.add("yash");
		al.add("vinayak");
		al.add("vaibhav");
		al.add("uttu");

        try{
		//Serialization

		FileOutputStream fos=new FileOutputStream("e:\\ArrayFile.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		oos.writeObject(al);
		fos.close();
		oos.close();

		//Deserialization

		FileInputStream fis=new FileInputStream("e:\\ArrayFile.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);

		ArrayList al2=(ArrayList)ois.readObject();

		System.out.println(al2);

	}catch(Exception ee){System.out.println(ee.toString());}

		}
	}