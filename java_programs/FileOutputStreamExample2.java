import java.io.FileOutputStream;

public class  FileOutputStreamExample2{

	public static void main(String[] arg){

		try{

			FileOutputStream fos=new FileOutputStream("e:\\Textout.txt");

			String str="Yash Dhurve";

			byte b[]= str.getBytes();       //converting string into byte array.

			fos.write(b);
			fos.close();

			System.out.println("Sucess");
		}

		catch(Exception e){
			System.out.println(e);
		}

	}

}

