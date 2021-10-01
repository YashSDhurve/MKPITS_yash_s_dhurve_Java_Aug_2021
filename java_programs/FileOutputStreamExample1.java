import java.io.FileOutputStream;

public class  FileOutputStreamExample1{

	public static void main(String[] arg){

		try{

			FileOutputStream fos=new FileOutputStream("e:\\Textout.txt");

			fos.write(65);
			fos.close();

			System.out.println("Sucess");
		}

		catch(Exception e){
			System.out.println(e);
		}

	}

}

