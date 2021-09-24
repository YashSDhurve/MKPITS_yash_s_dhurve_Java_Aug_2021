class Employee{

String empName="Yash Dhurve";

void display(){

	System.out.println("Employee Name is "+empName);

		      }

              }

class partTimeEmployee extends Employee{

String empName="Vinayak Pal";

void display(){

	System.out.println("partTimeEmployee Name is "+empName);

	super.display();

		      }

              }

class SuperEx4{

	public static void main(String[] arg){

		partTimeEmployee p=new partTimeEmployee();

		p.display();

	}

}
