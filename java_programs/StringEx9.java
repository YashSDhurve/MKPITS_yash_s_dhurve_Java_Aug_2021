class StringEx9{
	public static void main(String[] arg){

java.util.Scanner scan=new java.util.Scanner(System.in);

System.out.println("Enter Email address");

String str=scan.next();

boolean b=str.contains("@gmail.com");

if(b==true){
	System.out.println("valid email address");
	}

	else{
		System.out.println("Invalid email address");
	}



		}
	}

