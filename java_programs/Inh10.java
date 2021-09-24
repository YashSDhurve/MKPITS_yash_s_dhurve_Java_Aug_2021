//assignment :
//create a person class , then create a student class inherited from person class ,
//then create a parttimestudent class inherited from student class.




class Person{

String name;
String address;

void insertPersonData(String name,String address){

	this.name=name;
	this.address=address;

}

void displayPersonData(){

System.out.println("name : " +name);
System.out.println("address : " +address);

}

}

class Student extends Person{

int rno;
int marks;

void insertStudentData(int rno,int marks){

	this.rno=rno;
	this.marks=marks;

}

void displayStudentData(){

	System.out.println("roll no="+rno);
	System.out.println("marks="+marks);

}

}

class partTimeStudent extends Student{

int noOfSubject;

void insertpartTimeStudentData(int noOfSubject){

	this.noOfSubject=noOfSubject;

}

void displaypartTimeStudentData(){

	System.out.println("number of subject joined="+noOfSubject);

}

}

class Inh10{

public static void main(String[] arg){

	System.out.println("displaying partTimeStudent details -");

	java.util.Scanner s=new java.util.Scanner(System.in);

	System.out.println("enter student name");
	String name=s.next();

	System.out.println("enter student address");
	String address=s.next();

	System.out.println("enter student roll number");
	int rno=s.nextInt();

	System.out.println("enter marks");
	int marks=s.nextInt();

	System.out.println("enter number of subject joined by the partTimeStudent");
	int noOfSubject=s.nextInt();


partTimeStudent p=new partTimeStudent();

p.insertPersonData(name,address);
p.insertStudentData(rno,marks);
p.insertpartTimeStudentData(noOfSubject);

p.displayPersonData();
p.displayStudentData();
p.displaypartTimeStudentData();

}

}

