//Calling parameterized constructor from default constructor:

class Employee{

int empno;
String empname;
String designation;

Employee(){

this(262,"Yash Shankarrao Dhurve","software Developer");  //Calling parameterized constructor from default constructor:

System.out.println("Calling parameterized constructor from default constructor:");

}

Employee(int empno,String empname,String designation){

this.empno=empno;
this.empname=empname;
this.designation=designation;

}

void display(){

System.out.println("empno= "+empno);
System.out.println("employee name :"+empname);
System.out.println("designation :"+designation);
}

}

class TestThis13{

public static void main(String[] arg){

Employee e= new Employee();

e.display();
}

}


