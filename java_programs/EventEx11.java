//Outer class Example
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class EventEx11 extends Frame
{
	TextField tf1;

EventEx11(){

	    setTitle("Outer class Example");
		setLayout(null);
		setSize(400,400);
	    setVisible(true);


	tf1=new TextField();
	tf1.setBounds(170,100,100,30);
	add(tf1);

	Button b1=new Button("Check");
	b1.setBounds(170,160,80,30);

	Outer o=new Outer(this);
	b1.addActionListener(o);

	add(b1);

	}

public static void main(String[] arg){

	new EventEx11();

	}


}

//////////////////////////////////////////////


class Outer implements ActionListener{

	EventEx11 E;

	Outer(EventEx11 E){

		this.E=E;

		}

	public void actionPerformed(ActionEvent ae){

		E.tf1.setText("Outer class Exmaple");

		}

	}