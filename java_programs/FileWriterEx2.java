import java.io.FileWriter;

import java.util.*;

class FileWriterEx2{

public static void main(String[] arg){

	try{

		FileWriter fw=new FileWriter("e:\\FileWriter.txt");

		Scanner scan=new Scanner(System.in);

		System.out.println("Write msg");

		String str="msg from the user : ";

		str+= scan.nextLine();


		//byte[] b=str.getBytes();

		fw.write(str);
		fw.close();

		}

		catch(Exception e){
			System.out.println(e);
			}

			System.out.println("Success");

		}

	}