

class Address{
	String city;
	String state;
	String country;

	 Address(String city,String state,String country){
		this.city=city;
		this.state=state;
		this.country=country;
		}
	}

	class Customer{
		String custname;
		Address address;

		Customer(String custname,Address address){
		this.custname=custname;
		this.address=address;
		}

	void display(){
		System.out.println("Customer name : "+custname);
		System.out.println("Customer Address : " +address.city+", "+address.state+", "+address.country);
		}
		}

class Aggregation4{
	public static void main(String[] arg){

		java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter Customer name ");
		String custname=scan.next();
		System.out.println("Enter city ");
		String city=scan.next();
		System.out.println("Enter state ");
		String state=scan.next();
		System.out.println("Enter country ");
		String country=scan.next();

				Address address1=new Address(city,state,country);
				Customer e=new Customer(custname,address1);

		e.display();
	}
}