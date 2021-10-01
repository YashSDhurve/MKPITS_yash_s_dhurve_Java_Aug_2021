import java.io.FileInputStream;

class FileInputStream1{

	public static void main(String[] arg){

		try{

			FileInputStream fis = new FileInputStream("e://FileOutputStreamExample3.txt");

			int i= fis.read();

			System.out.println( (char)i );

			fis.close();

		}

		catch(Exception e){

			System.out.println(e);

	      }

	  }

  }

