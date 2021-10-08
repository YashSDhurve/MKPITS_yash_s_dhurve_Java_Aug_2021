//repeat the above program by accepting values from the user.

class Address{
	String addressline;
	String city;
	String state;
	int pincode;

	 Address(String addressline,String city,String state,int pincode){
		this.addressline=addressline;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
		}
	}

	class Employee{
		int empno;
		String name;
		int salary;
		Address address;

		Employee(int empno,String name,int salary,Address address){
		this.empno=empno;
		this.name=name;
		this.salary=salary;
		this.address=address;
		}

	void display(){
		System.out.println("Employee number = "+empno);
		System.out.println("Employee name : "+name);
		System.out.println("Employee salary = "+salary);
		System.out.println("Employee Address : "+address.addressline+", "+address.city+", "+address.state+", "+address.pincode);
		}
		}

class Aggregation2{
	public static void main(String[] arg){

		java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter Employee number ");
		int empno=scan.nextInt();
		System.out.println("Enter Employee name ");
		String name=scan.next();
		System.out.println("Enter Employee salary ");
		int salary=scan.nextInt();
		System.out.println("Enter addressline ");
		String addressline=scan.next();
		System.out.println("Enter city ");
		String city=scan.next();
		System.out.println("Enter state ");
		String state=scan.next();
		System.out.println("Enter pincode ");
		int pincode=scan.nextInt();

				Address address1=new Address(addressline,city,state,pincode);
				Employee e=new Employee(empno,name,salary,address1);

		e.display();
	}
}