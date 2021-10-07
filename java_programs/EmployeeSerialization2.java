import java.io.*;
import java.util.*;

class Employee implements Serializable{
int empno;
String name;
String desig;

 Employee(int empno,String name,String desig){
this.empno=empno;
this.name=name;
this.desig=desig;
}
}

class EmployeeSerialization2{

public static void main(String[] arg){
try{
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter Employee no. ");
	int empno=scan.nextInt();
	System.out.println("Enter Employee name ");
	String name=scan.next();
	System.out.println("Enter Employee Designation ");
	String desig=scan.next();

Employee e1=new Employee(empno,name,desig);
FileOutputStream fos=new FileOutputStream("e:\\Emp.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(e1);         //Serialization
oos.flush();
fos.close();
System.out.println("Success");
}catch(Exception ee){System.out.println(ee.toString() );}

try{
FileInputStream fis=new FileInputStream("e:\\Emp.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
Employee e2=(Employee)ois.readObject();           //Deserialization

            System.out.println("Employee no. : "+e2.empno);
			System.out.println("Employee name : "+e2.name);
			System.out.println("Employee Designation : "+e2.desig);

}catch(Exception ee){System.out.println(ee.toString() );}



}

}

