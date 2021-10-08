

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

class Aggregation3{
	public static void main(String[] arg){

				Address address1=new Address("Nagpur","Maharashtra","India");
				Customer c=new Customer("yash dhurve",address1);

		c.display();
	}
}