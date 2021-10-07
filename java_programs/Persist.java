import java.io.*;

public class Persist{
public static void main(String[] arg){

try{
	Customer c1=new Customer("Yash Dhurve","yash1999@gmail.com");

	FileOutputStream fos=new FileOutputStream("e://cust.txt");

	ObjectOutputStream oos=new ObjectOutputStream(fos);

	oos.writeObject(c1);     //Serialization
	oos.flush();
	fos.close();
}
catch(Exception ee){
System.out.println(ee.toString() );
}
System.out.println("Success");

}
}