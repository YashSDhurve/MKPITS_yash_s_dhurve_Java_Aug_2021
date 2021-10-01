import java.io.FileInputStream;

class FileInputStream2{

	public static void main(String[] arg){

		try{

			FileInputStream fis = new FileInputStream("e://FileOutputStreamExample3.txt");

			int i=0;

			while(( i= fis.read())!=-1){

			System.out.print( (char)i );

		}

			fis.close();


		}

		catch(Exception e){

			System.out.println(e);

	      }

	  }

  }

