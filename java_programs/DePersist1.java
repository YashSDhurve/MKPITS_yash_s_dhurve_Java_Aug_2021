import java.io.*;

public class DePersist1{
	public static void main(String[] arg){
		try{
			FileInputStream fis=new FileInputStream("e:\\Student.txt");

			ObjectInputStream ois=new ObjectInputStream(fis);

			Student s1= (Student)ois.readObject();    //Deserialization

			System.out.println("Student ID : "+s1.id);
			System.out.println("Student name : "+s1.name);
			System.out.println("Batch : "+s1.batch);
		}
		catch(Exception ee){
			System.out.println(ee.toString() );
		}
	}
}
