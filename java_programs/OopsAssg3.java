//3.
//Assign and print the roll_number, phone_number and address of two students having names "Sam" and "John"
//respectively by creating two objects of class 'Student'.


class Student{

String name;
int rollno;
int phoneno;
String address;

void insert(String name,int rollno,int phoneno,String address){

    this.name=name;
	this.rollno=rollno;
	this.phoneno=phoneno;
	this.address=address;

}

void display(){

	System.out.println("Name : "+name);
	System.out.println("Roll number="+rollno);
	System.out.println("Phone number="+phoneno);
	System.out.println("Address : "+address);

}



}

class OopsAssg3{

public static void main(String[] arg){

Student s1=new Student();

s1.insert("john",2,1234567890,"nagpur");
s1.display();

Student s2=new Student();

s2.insert("sam",5,1987654321,"mumbai");
s2.display();

}

}
