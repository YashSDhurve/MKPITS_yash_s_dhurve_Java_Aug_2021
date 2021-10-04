//4.
//Write a program to print the area and perimeter(Perimeter = sum of the three sides) of a triangle
//having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

class Triangle{

	int side1=3;
	int side2=4;
	int side3=5;
	double area;
	int perimeter;

	Triangle(){

		perimeter=side1+side2+side3;
		double s=perimeter/2;                  //where s=SemiPerimeter

		area= Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

		}

	void displayAreaAndPerimeter(){

		System.out.println("Area of triangle = "+area);
		System.out.println("perimeter of triangle = "+perimeter);

		}


	}

class OopsAssg4{

	public static void main(String[] arg){

		Triangle scan=new Triangle();

		scan.displayAreaAndPerimeter();

		}

	}