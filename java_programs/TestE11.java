//create a class user

class User{

//private data members

private String userName;
private String password;

//creating public setter method

public void setUserName(String userName){

this.userName=userName;

}

public String getUserName(){

return userName;

}

public void setPassword(String password){

this.password=password;

}

public String getPassword(){

return password;

}

public String checkLogin(String userName,String password){

	if(userName.equals("yashdhurve24") && password.equals("Yashdhurve24")){

		return "Login Succesful for user"+userName;

	}

	else{

		return "Invalid Credentials , Try again !";

	}
}

}

class TestE11{

public static void main(String[] arg){

java.util.Scanner s = new java.util.Scanner(System.in);

System.out.println("enter userName");
String usrnme = s.next();

System.out.println("enter password");
String pwd = s.next();

User u1 = new User();

u1.setUserName(usrnme);
u1.setPassword(pwd);

String result = u1.checkLogin(u1.getUserName() , u1.getPassword());

System.out.println(result);



    }

    }