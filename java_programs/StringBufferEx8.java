import java.util.*;

class StringBufferEx8{
	public static void main(String[] arg){

		String str1="";
		String str2="";

Scanner scan=new Scanner(System.in);

System.out.println("enter name");
String name=scan.next();

StringBuffer sb=new StringBuffer(name);

 str1=sb.toString();

//System.out.println("enter middle name");
//String mname=scan.next();

sb.reverse();

 str2=sb.toString();

System.out.println("str1 = "+str1);
System.out.println("str2 = "+str2);

if(str1.equals(str2)){
	System.out.println("Name is palendrome");
	}

	else{
	System.out.println("Name is not a palendrome");
	}



		}
	}

