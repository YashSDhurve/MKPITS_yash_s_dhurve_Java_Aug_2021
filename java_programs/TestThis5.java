// give examples of this keyword
//create class Order with elements orderno,quantity,amount,ordername and method enterdetails,display

class Order{

int orderno;
int quantity;
float amount;
String ordername;

void enterdetails(int orderno,int quantity,float amount,String ordername){

this.orderno=orderno;
this.quantity=quantity;
this.amount=amount;
this.ordername=ordername;
}

void display(){

System.out.println("order no:"+orderno);
System.out.println("quantity="+quantity);
System.out.println("amount="+amount);
System.out.println("order name:"+ordername);
}

}

class TestThis5{

public static void main(String[] arg){

Order o1=new Order();
o1.enterdetails(70,4,350.99f,"Pizza");
o1.display();
Order o2=new Order();
o2.enterdetails(72,5,450.99f,"burger");
o2.display();
}

}