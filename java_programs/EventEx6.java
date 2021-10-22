import java.awt.*;
import java.awt.event.*;

//wap to accept empno, empname , salary
//and display the bonus (35% if salary is greater than 20000,
//25% if salary is greater than 10000 otherwise bonus =15%)

class EventEx6 extends Frame implements ActionListener{

	Button b1;
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3;

	EventEx6(){

		l1=new Label("empno");
		l1.setBounds(50,100,100,30);
		add(l1);

		t1=new TextField();
		t1.setBounds(160,100,100,30);
		add(t1);

	        l3=new Label("empname");
			l3.setBounds(50,150,100,30);
			add(l3);

			t2=new TextField();
			t2.setBounds(160,150,100,30);
		    add(t2);

		        l4=new Label("salary");
			    l4.setBounds(50,200,100,30);
			    add(l4);

			    t3=new TextField();
			    t3.setBounds(160,200,100,30);
		        add(t3);

		 b1=new Button("Display Bonus");
		b1.setBounds(150,260,100,30);
		//register button component with listener
		b1.addActionListener(this);
		add(b1);

		l2=new Label("Salary = ");
		l2.setBounds(50,310,200,30);
		add(l2);

		l5=new Label("Bonus = ");
		l5.setBounds(50,350,200,30);
		add(l5);

		setLayout(null);
		setSize(500,500);
		setVisible(true);

		}

		public void actionPerformed(ActionEvent ae){

            int salary=0;
			int bonus=0;

              salary=Integer.parseInt(t3.getText());
              ae.getSource();

             l2.setText("salary = "+salary);

             if(salary>=20000)
             bonus=35;

             if(salary<20000 && salary>=10000)
             bonus=25;

             if(salary<10000)
             bonus=15;

             l5.setText("Bonus = "+bonus+"%");


			}

		public static void main(String[] arg){
			EventEx6 e=new EventEx6();
			}

	}