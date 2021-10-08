
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

class Aggregation1{
	public static void main(String[] arg){
		Address address1=new Address("Kharbi road","Nagpur","Maharashtra",441202);
		Employee e=new Employee(12,"Yash Dhurve",30000,address1);

		e.display();
	}
}