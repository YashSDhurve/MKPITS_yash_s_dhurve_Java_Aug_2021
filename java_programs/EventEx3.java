import java.awt.*;
import java.awt.event.*;

//example 3 : wap to accept 2 no. and print addition of 2 no.

class EventEx3 extends Frame implements ActionListener{

	Button b1;
	Label l1,l2,l3;
	TextField t1,t2;

	EventEx3(){

		l1=new Label("Enter number1");
		l1.setBounds(50,100,100,30);
		add(l1);

		t1=new TextField();
		t1.setBounds(160,100,100,30);
		add(t1);

	        l3=new Label("Enter number2");
			l3.setBounds(50,150,100,30);
			add(l3);

			t2=new TextField();
			t2.setBounds(160,150,100,30);
		    add(t2);

		 b1=new Button("Add");
		b1.setBounds(150,210,100,30);
		//register button component with listener
		b1.addActionListener(this);
		add(b1);

		l2=new Label("Result = ");
		l2.setBounds(50,250,100,30);
		add(l2);

		setLayout(null);
		setSize(400,400);
		setVisible(true);

		}

		public void actionPerformed(ActionEvent ae){

			int num1=Integer.parseInt(t1.getText());
			int num2=Integer.parseInt(t2.getText());

			int res=num1+num2;

			l2.setText("Result = "+res);

			}

		public static void main(String[] arg){
			EventEx3 e=new EventEx3();
			}

	}