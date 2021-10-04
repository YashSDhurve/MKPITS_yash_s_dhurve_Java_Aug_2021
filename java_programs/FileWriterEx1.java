import java.io.FileWriter;

class FileWriterEx1{

public static void main(String[] arg){

	try{

		FileWriter fw=new FileWriter("e:\\FileWriter.txt");

		fw.write("Welcome to MKPITS");
		fw.close();

		}

		catch(Exception e){
			System.out.println(e);
			}

			System.out.println("Success");

		}

	}