import java.io.Serializable;
import java.io.*;

class Person implements Serializable{
	int id;
	String name;

	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}

class Student extends Person{
	String course;
	int fee;

	Student(int id,String name,String course,int fee){
		super(id,name);
		this.course=course;
		this.fee=fee;
		}
}

class SerializationInh1{
	public static void main(String[] arg){
		try{
			Student s=new Student(123,"amit","BE",10000);

			FileOutputStream fos=new FileOutputStream("e:\\StudentInh.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.flush();
			fos.close();
			System.out.println("Details of Student written Successfully in the StudentInh.txt file");
		}catch(Exception ee){System.out.println(ee.toString() ); }

		try{

					FileInputStream fis=new FileInputStream("e:\\StudentInh.txt");
					ObjectInputStream ois=new ObjectInputStream(fis);
					Student s1=(Student)ois.readObject();

					System.out.println("Student id : "+s1.id);
					System.out.println("Student name : "+s1.name);
					System.out.println("Student course : "+s1.course);
					System.out.println("Student fee : "+s1.fee);

		}catch(Exception ee){System.out.println(ee.toString() ); }

	}
}