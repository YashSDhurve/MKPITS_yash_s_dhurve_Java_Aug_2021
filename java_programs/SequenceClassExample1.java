import java.io.*;

class SequenceClassExample1{

	public static void main(String[] arg)throws Exception{

		FileInputStream input1=new FileInputStream("e:\\File1.txt");
		FileInputStream input2=new FileInputStream("e:\\File2.txt");

		SequenceInputStream sis=new SequenceInputStream(input1,input2);

		int k;

		while((k=sis.read())!=-1){

			System.out.print((char)k);

		}

		sis.close();
		input1.close();
		input2.close();



		}

	}