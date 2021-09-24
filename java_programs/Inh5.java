//another example of single inheritance
//create a parent class person and then create a child class Employee

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

class Employee extends Person{

int empno;
float salary;

void insertEmployeeData(int empno,float salary){

	this.empno=empno;
	this.salary=salary;

}

void displayEmployeeData(){

	System.out.println("Employee number="+empno);
	System.out.println("Employee salary="+salary);

}

}
class Inh5{

public static void main(String[] arg){

Employee e=new Employee();

e.insertPersonData("Yash Dhurve","Kharbi Road");
e.displayPersonData();

e.insertEmployeeData(262,30000);
e.displayEmployeeData();

}

}

