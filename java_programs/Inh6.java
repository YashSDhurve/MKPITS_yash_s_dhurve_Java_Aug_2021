//create a person class and then create a child class customer having fields custno,gstno.

class Person{

String name;
String address;

void insertPersonData(String name,String address){

this.name=name;
this.address=address;

}

void displayPersonData(){

System.out.println("name of the person : "+name);
System.out.println("Address of the person : "+address);
}

}

class Customer extends Person{

int custno;
int gstno;

void insertCustomerData(int custno,int gstno){

this.custno=custno;
this.gstno=gstno;

}

void displayCustomerData(){

System.out.println("Customer number of the customer = "+custno);
System.out.println("GST number of the customer= "+gstno);
}

}

class Inh6{

public static void main(String[] arg){

Customer c=new Customer();

c.insertPersonData("Yash Dhurve","Kharbi Road");
c.displayPersonData();

c.insertCustomerData(34,23432);
c.displayCustomerData();
}

}