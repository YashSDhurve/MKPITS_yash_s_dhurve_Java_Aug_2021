import java.io.FileReader;

public class FileReaderEx1{

	public static void main(String[] arg)throws Exception{

		FileReader fr=new FileReader("e:\\FileReader.txt");

		int i;

		while((i=fr.read())!=-1){

			System.out.print((char)i);

			}

			fr.close();

			System.out.println("............Success");

		}

	}