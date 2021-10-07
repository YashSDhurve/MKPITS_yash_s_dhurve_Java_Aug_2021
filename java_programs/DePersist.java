import java.io.*;

public class DePersist{
public static void main(String[] arg){

try{

	FileInputStream fis=new FileInputStream("e://cust.txt");

	ObjectInputStream ois=new ObjectInputStream(fis);

	Customer c1= (Customer)ois.readObject();    //Deserialization

	System.out.println("Customer name : "+c1.name);
System.out.println("Customer email ID is : "+c1.email);

}
catch(Exception ee){
System.out.println(ee.toString() );
}


}
}