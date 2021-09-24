class Employee{

String empName="Yash Dhurve";

              }

class PartTimeEmployee extends Employee{

String empName="Vinayak Pal";

void display(){

System.out.println("partTimeEmployee name is "+empName);        // thiw will show Vinayak Pal

System.out.println("Employee name is "+super.empName);        // thiw will show Yash Dhurve

             }

             }

class SuperEx3{

public static void main(String[] arg){

PartTimeEmployee p=new PartTimeEmployee();

p.display();

}

}