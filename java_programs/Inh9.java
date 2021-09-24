//another example of multilevel inheritance
//create a class person , then create  a class employee inherited from person class,
//then create a class parttimeemployee inherited from employee class

//repeat the same program by accepting values from the user



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

	System.out.println("Working hours of the employee="+workingHours);
	System.out.println("Designation of the employee="+desig);

}

}

class Inh9{

public static void main(String[] arg){

	java.util.Scanner s=new java.util.Scanner(System.in);

	System.out.println("enter employee name");
	String name=s.next();

	System.out.println("enter employee address");
	String address=s.next();

	System.out.println("enter employee's Employee number");
	int empno=s.nextInt();

	System.out.println("enter employee's salary");
	int salary=s.nextInt();

	System.out.println("enter employee's working hours");
	int workingHours=s.nextInt();

	System.out.println("enter employee's designation");
	String desig=s.next();

    System.out.println("displaying employee details -");


partTimeEmployee p=new partTimeEmployee();

p.insertPersonData(name,address);
p.insertEmployeeData(empno,salary);
p.insertpartTimeEmployeeData(workingHours,desig);

p.displayPersonData();
p.displayEmployeeData();
p.displaypartTimeEmployeeData();

}

}

