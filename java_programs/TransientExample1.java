import java.io.*;

class Student implements Serializable{
	int id;
	String name;
	transient int age;

	Student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
		}
	}

class TransientExample1{
public static void main(String[] arg){

try{
	Student s=new Student(123,"amit",19);
	FileOutputStream fos=new FileOutputStream("e:\\Student2.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(s);
    oos.flush();
    fos.close();

    System.out.println("Success");
}catch(Exception ee){System.out.println(ee.toString() );}

try{

	FileInputStream fis=new FileInputStream("e:\\Student2.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
    Student s1 = (Student)ois.readObject();

      System.out.println(s1.id+" "+s1.name+" "+s1.age);
}catch(Exception ee){System.out.println(ee.toString() );}

}

}