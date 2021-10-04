//5.
//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
//by creating a class named 'Triangle' with constructor having the three sides as its parameters.

class Triangle{

	int side1;
	int side2;
	int side3;
	double area;
	int perimeter;

	Triangle(int side1,int side2,int side3){

		this.side1=side1;
		this.side2=side2;
		this.side3=side3;

		perimeter=side1+side2+side3;
				double s=perimeter/2;                  //where s=SemiPerimeter

		area= Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

		}

	void displayAreaAndPerimeter(){

		System.out.println("Area of triangle = "+area);
		System.out.println("perimeter of triangle = "+perimeter);

		}


	}

class OopsAssg5{

	public static void main(String[] arg){

		Triangle scan=new Triangle(3,4,5);

		scan.displayAreaAndPerimeter();

		}

	}