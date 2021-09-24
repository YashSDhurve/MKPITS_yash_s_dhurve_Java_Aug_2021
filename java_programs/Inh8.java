//another example of multilevel inheritance
//create a class person , then create  a class employee inherited from person class,
//then create a class parttimeemployee inherited from employee class


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

class partTimeEmployee extends Employee{

int workingHours;
String desig;

void insertpartTimeEmployeeData(int workingHours,String desig){

	this.workingHours=workingHours;
	this.desig=desig;

}

void displaypartTimeEmployeeData(){

	System.out.println("Working hours of the partTimer="+workingHours);
	System.out.println("Designation of the partTimer="+desig);

}

}

class Inh8{

public static void main(String[] arg){

partTimeEmployee p=new partTimeEmployee();

p.insertPersonData("Yash Dhurve","Kharbi Road");
p.displayPersonData();

p.insertEmployeeData(262,10000);
p.displayEmployeeData();

p.insertpartTimeEmployeeData(5,"Intern");
p.displaypartTimeEmployeeData();


}

}

