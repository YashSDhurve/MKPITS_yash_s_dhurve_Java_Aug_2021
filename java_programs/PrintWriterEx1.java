import java.io.PrintWriter;

public class PrintWriterEx1{

	public static void main(String[] arg)throws Exception{

		//Data to write on console using PrintWriter

		PrintWriter pw=new PrintWriter(System.out);

		pw.write("mkpits gives tutorials about almost all technologies    ");
		pw.flush();
		pw.close();

		//Data to write on File using PrintWriter

		PrintWriter pw1=null;

		pw1=new PrintWriter("e:\\PrintWriter.txt");

		pw1.write("Like Java, Spring, Hibernate, Android, PHP etc");
		pw1.flush();
		pw1.close();

		}



	}