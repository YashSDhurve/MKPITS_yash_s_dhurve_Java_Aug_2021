import java.io.*;

class Student implements Serializable{
int id;
String name;
Address address;   //HAS-A relationship

Student(int id,String name){

	this.id=id;
	this.name=name;
	}

public static void main(String[] arg){
Student s = new Student(121,"Varun","ramna maruti","nagpur","maharashtra");
try{
FileOutputStream fos=new FileOutputStream("e:\\Student1.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(s);
oos.flush();
fos.close();

System.out.println("Success");
}catch(Exception ee){System.out.println(ee.toString() );}
}

}