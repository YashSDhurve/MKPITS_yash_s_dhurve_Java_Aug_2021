import java.awt.*;
import java.awt.event.*;

//wap to accept 3 subject marks and display total, percentage and grade;
class EventEx5 extends Frame implements ActionListener{

	Button b1;
	Label l1,l2,l3,l4,l5,l6;
	TextField t1,t2,t3;

	EventEx5(){

		l1=new Label("Subject 1");
		l1.setBounds(50,100,100,30);
		add(l1);

		t1=new TextField();
		t1.setBounds(160,100,100,30);
		add(t1);

	        l3=new Label("Subject 2");
			l3.setBounds(50,150,100,30);
			add(l3);

			t2=new TextField();
			t2.setBounds(160,150,100,30);
		    add(t2);

		        l4=new Label("Subject 3");
			    l4.setBounds(50,200,100,30);
			    add(l4);

			    t3=new TextField();
			    t3.setBounds(160,200,100,30);
		        add(t3);

		 b1=new Button("Result");
		b1.setBounds(150,260,80,30);
		//register button component with listener
		b1.addActionListener(this);
		add(b1);

		l2=new Label("Total marks = ");
		l2.setBounds(50,310,200,30);
		add(l2);

		        l5=new Label("Percentage = ");
				l5.setBounds(50,350,200,30);
		        add(l5);

		                l6=new Label("Grade : ");
		         		l6.setBounds(50,390,200,30);
		                add(l6);

		setLayout(null);
		setSize(500,500);
		setVisible(true);

		}

		public void actionPerformed(ActionEvent ae){

			int total=0;
			float per;
			String grade;

			int sub1=Integer.parseInt(t1.getText());
			int sub2=Integer.parseInt(t2.getText());
			int sub3=Integer.parseInt(t3.getText());

             total=sub1+sub2+sub3;
             l2.setText("Total marks = "+total);

             per=(float)(total/300.0f)*100.0f;
             l5.setText("Percentage = "+per);

             if(per>=75)
             grade="Distinction";

             else if(per>=60 && per<75)
             grade="First";

             else if(per>=35 && per<60)
             grade="pass";
             else
             grade="fail";

             l6.setText("Grade = "+grade);


			}

		public static void main(String[] arg){
			EventEx5 e=new EventEx5();
			}

	}