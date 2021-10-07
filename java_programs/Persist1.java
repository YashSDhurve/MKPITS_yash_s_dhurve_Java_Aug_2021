import java.io.*;

public class Persist1 {

	public static void main(String[] arg){

		try{
		Student s1=new Student(262,"Yash Dhurve",'B');

		FileOutputStream fos=new FileOutputStream("e:\\Student.txt");

		ObjectOutputStream oos=new ObjectOutputStream(fos);

		oos.writeObject(s1);      //Serialization
		oos.flush();
		fos.close();

		System.out.println("Success");
	}
	catch(Exception ee){
	System.out.println(ee.toString() );
	}
	}
}