//create a package mkpits2 and a class Employee having fields empno,empname, basicsalary
//create method insert , calculateBonus, display .

package mkpits2;

public class Employee{

int empno;
String name;
int basicsalary;
float bonus;


public void insert(int en,String n,int bs){

empno=en;
name=n;
basicsalary=bs;

}

public void calBonus(){

bonus=(float) basicsalary*0.65f;

}

public void display(){

System.out.println("employee no="+empno);
System.out.println("employee name:"+name);
System.out.println("basic salary="+basicsalary);
System.out.println("bonus="+bonus);

}

}

