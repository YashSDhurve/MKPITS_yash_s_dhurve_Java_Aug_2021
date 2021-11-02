//wap to accept a no. and print table of that number.

import java.awt.*;
import java.awt.event.*;
import java.util.*;

class EventEx10  extends Frame implements ActionListener {
Label l1,l2;
TextField tf1;
Button b1;
TextArea ta1;

EventEx10(){

	l1=new Label("Enter Number");
	l1.setBounds(50,100,100,30);
	add(l1);

	tf1=new TextField();
	tf1.setBounds(170,100,100,30);
	add(tf1);

	b1=new Button("result");
	b1.setBounds(170,160,80,30);
	//registering the button component to the actionListener
	b1.addActionListener(this);
	add(b1);

	l2=new Label("Table = ");
	l2.setBounds(50,210,100,30);
	add(l2);

	ta1=new TextArea(30,30);
	ta1.setBounds(150,220,100,110);
	add(ta1);


	setLayout(null);
	setSize(400,400);
	setVisible(true);

	}

	//implementation of ActionListener interface ActionPerformed

public void actionPerformed(ActionEvent ae){

	int res=1;

	int num=Integer.parseInt(tf1.getText());

	StringBuilder sb=new StringBuilder();

	if(ae.getSource()==b1){
		for(int i=1;i<=10;i++){
			res=num*i;

			sb.append(num+"*"+i+"="+res+"\n");

			}

			ta1.setText(sb.toString());
		}

	}

public static void main(String[] arg){

	EventEx10 e=new EventEx10();

	}


}