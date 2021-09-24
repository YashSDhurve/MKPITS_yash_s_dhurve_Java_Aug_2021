//another example of single inheritance
//create a parent class person and then create a child class student

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

System.out.println("roll no = " +rno);
System.out.println("marks = " +marks);

}

}

class Inh4{

public static void main(String[] arg){

Student s=new Student();

s.insertStudentData(262,96);
s.displayStudentData();

s.insertPersonData("Yash Dhurve","Kharbi Road");
s.displayPersonData();

}

}

