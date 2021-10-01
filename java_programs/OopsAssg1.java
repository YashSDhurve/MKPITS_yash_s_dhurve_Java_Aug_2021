//1.
//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
//First method named as 'setDim' takes length and breadth of rectangle as parameters and
//the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

class Area{

float length,breadth,area;

void setDim(float length,float breadth){

this.length=length;
this.breadth=breadth;

}

void getArea(){

area=length*breadth;

}

void display(){

System.out.println("area of rectangle="+area);

}

}

class OopsAssg1{

public static void main(String[] arg){

Area a = new Area();

a.setDim(12.5f,8.5f);
a.getArea();
a.display();

}

}
