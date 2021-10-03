import java.io.*;

class SequenceClassExample2{

	public static void main(String[] arg)throws Exception{

		FileInputStream input1=new FileInputStream("e:\\File1.txt");
		FileInputStream input2=new FileInputStream("e:\\File2.txt");

		FileOutputStream fos=new FileOutputStream("e:\\File1+File2.txt");

		SequenceInputStream sis=new SequenceInputStream(input1,input2);

		int i;

		while((i=sis.read())!=-1){

			fos.write(i);

			}

			sis.close();
			fos.close();
			input1.close();
			input2.close();

			System.out.println("Success");

		}

	}