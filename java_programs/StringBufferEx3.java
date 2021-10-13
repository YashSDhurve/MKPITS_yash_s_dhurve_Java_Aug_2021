import java.util.*;

class StringBufferEx3{
	public static void main(String[] arg){

Scanner scan=new Scanner(System.in);

System.out.println("Enter your First name");
String fname=scan.next();

StringBuffer sb=new StringBuffer(fname);

System.out.println("Enter your last name");
String lname=scan.next();

sb.insert(4,lname);

System.out.println(sb);


		}
	}

