//wap to accept a num and print whether it is prime no. or not.
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class EventEx9 extends Frame implements ActionListener {
Label l1,l2,l3;
TextField tf1,tf2;
Button b1;

EventEx9(){

	l1=new Label("Enter Number");
	l1.setBounds(50,100,100,30);
	add(l1);

	tf1=new TextField();
	tf1.setBounds(170,100,100,30);
	add(tf1);

	b1=new Button("Check");
	b1.setBounds(170,160,80,30);
	//registering the button component to the actionListener
	b1.addActionListener(this);
	add(b1);

	l2=new Label("Answer = ");
	l2.setBounds(50,210,80,30);
	add(l2);

	l3=new Label(" ");
		l3.setBounds(140,210,150,30);
	add(l3);


	setLayout(null);
	setSize(400,400);
	setVisible(true);

	}

	//implementation of ActionListener interface ActionPerformed

public void actionPerformed(ActionEvent ae){

	int num=Integer.parseInt(tf1.getText());

	int i=2;

	boolean b=false;
while(i<=num/2){
	           if(num%i ==0){
                             b=true;
                             break;
						 }
                   i++;
			}
		if(!b)
		l3.setText(num+" is a prime number");
		else
		l3.setText(num+" is not a prime number");

	}

public static void main(String[] arg){

	EventEx9 e=new EventEx9();

	}


}