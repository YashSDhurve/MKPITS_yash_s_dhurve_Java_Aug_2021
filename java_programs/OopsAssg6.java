//6.
//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with
//a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.

class Rectangle{

	int length;
	int breadth;
	double area;

	 Rectangle(int length,int breadth){

		this.length=length;
		this.breadth=breadth;
        area= length*breadth;
		}

	void area(){
        System.out.println("length of Rectangle = "+length);
        System.out.println("breadth of Rectangle = "+breadth);
		System.out.println("Area of Rectangle = "+area);
		}

	}

class OopsAssg6{

	public static void main(String[] arg){

		Rectangle r1=new Rectangle(4,5);
		Rectangle r2=new Rectangle(5,8);

		r1.area();
		r2.area();

		}

	}