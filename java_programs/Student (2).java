//Java Program to demonstrate the use of static variable  

class Student{

int rno;                 //instance variable
String name;

static String college="kdk";            //static variable

//creating constructor

Student(int r,String n){

rno=r;
name=n;

}

//creating method display

void display(){

System.out.println(rno+""+name+""+college);

}

}