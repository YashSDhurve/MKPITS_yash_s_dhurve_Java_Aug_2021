
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1{

	public static void main(String[]  arg){

		try{

			FileInputStream is = new FileInputStream("e:\\File1.txt");

			InputStreamReader rdr=new InputStreamReader(is);

			int data;

			while((data=rdr.read())!=-1){

				System.out.print((char)data);
                    }
			}


			catch(Exception e){

				System.out.println(e);

			}

			System.out.println("Success");

		}
}

