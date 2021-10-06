import java.io.PrintStream;
import java.io.FileOutputStream;

public class PrintStreamEx1{

	public static void main(String[] arg)throws Exception{

		FileOutputStream fos=new FileOutputStream("e:\\PrintStreamEx1.txt");

		PrintStream ps=new PrintStream(fos);

        ps.println(" August Batch");
		ps.println(2021);
		ps.println("Welcome to mkpits");
		ps.close();
		fos.close();

		System.out.println("Success");

		}

	}