import java.util.*;

class StringBufferEx5{
	public static void main(String[] arg){

Scanner scan=new Scanner(System.in);

System.out.println("enter name");
String name=scan.next();

StringBuffer sb=new StringBuffer(name);

System.out.println("enter middle name");
String mname=scan.next();

sb.replace(3,7,mname);

System.out.println(sb);


		}
	}

