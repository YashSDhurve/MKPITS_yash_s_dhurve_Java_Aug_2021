import java.awt.*;
import java.awt.event.*;

//wap to accept a number and print square of the number.

class EventEx2 extends Frame implements ActionListener{

	Button b1;
	Label l1,l2;
	TextField t1;

	EventEx2(){

		l1=new Label("Enter number");
		l1.setBounds(50,100,100,30);
		add(l1);

		t1=new TextField();
		t1.setBounds(160,100,100,30);
		add(t1);

		 b1=new Button("Square");
		b1.setBounds(150,180,100,30);
		//register button component with listener
		b1.addActionListener(this);
		add(b1);

		l2=new Label("Square = ");
		l2.setBounds(50,230,100,30);
		add(l2);

		setLayout(null);
		setSize(400,400);
		setVisible(true);

		}

		public void actionPerformed(ActionEvent ae){
			int num1=Integer.parseInt(t1.getText());

			int sqr=num1*num1;

			l2.setText("Square = "+sqr);
			}

		public static void main(String[] arg){
			EventEx2 e=new EventEx2();
			}

	}