import java.awt.*;
import java.awt.event.*;

//wap to accept 2 no. and create buttons for  addtion , substraction and multiplication

class EventEx4 extends Frame implements ActionListener{

	Button b1,b2,b3,b4;
	Label l1,l2,l3;
	TextField t1,t2;

	EventEx4(){

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
		b1.setBounds(50,210,80,30);
		//register button component with listener
		b1.addActionListener(this);
		add(b1);

		        b2=new Button("Substract");
				b2.setBounds(140,210,80,30);
				//register button component with listener
				b2.addActionListener(this);
		        add(b2);

		               b3=new Button("Multiply");
					   b3.setBounds(230,210,80,30);
					   //register button component with listener
					   b3.addActionListener(this);
		               add(b3);

		                       b4=new Button("Divide");
					           b4.setBounds(320,210,80,30);
					           //register button component with listener
					           b4.addActionListener(this);
		                       add(b4);

		l2=new Label("Result = ");
		l2.setBounds(50,250,100,30);
		add(l2);

		setLayout(null);
		setSize(450,400);
		setVisible(true);

		}

		public void actionPerformed(ActionEvent ae){

			int res=0;

			int num1=Integer.parseInt(t1.getText());
			int num2=Integer.parseInt(t2.getText());

			if(ae.getSource()==b1)
             res=num1+num2;
		     if(ae.getSource()==b2)
               res=num1-num2;
               if(ae.getSource()==b3)
                 res=num1*num2;
                 if(ae.getSource()==b4)
                   res=num1/num2;


			l2.setText("Result = "+res);

			}

		public static void main(String[] arg){
			EventEx4 e=new EventEx4();
			}

	}