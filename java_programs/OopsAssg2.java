//2.
//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
//Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

class Student{

String name;
int rollno;

void insert(int rollno,String name){

	this.rollno=rollno;
	this.name=name;

}

void display(){

	System.out.println("Roll no="+rollno);
	System.out.println("Name : "+name);

}



}

class OopsAssg2{

public static void main(String[] arg){

Student s=new Student();

s.insert(2,"john");
s.display();

}

}
