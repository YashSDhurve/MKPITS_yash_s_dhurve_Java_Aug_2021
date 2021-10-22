import java.awt.*;
import java.awt.event.*;

//wap to accept customername, productname ,product price , quantity and then display total amount.

class EventEx7 extends Frame implements ActionListener{

	Button b1;
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;

	EventEx7(){

		l1=new Label("Customer Name");
		l1.setBounds(50,100,100,30);
		add(l1);

		t1=new TextField();
		t1.setBounds(160,100,100,30);
		add(t1);

	        l3=new Label("Product Name");
			l3.setBounds(50,150,100,30);
			add(l3);

			t2=new TextField();
			t2.setBounds(160,150,100,30);
		    add(t2);

		        l4=new Label("Product Price");
			    l4.setBounds(50,200,100,30);
			    add(l4);

			    t3=new TextField();
			    t3.setBounds(160,200,100,30);
		        add(t3);

		 b1=new Button("Display");
		b1.setBounds(150,260,100,30);
		//register button component with listener
		b1.addActionListener(this);
		add(b1);

		l2=new Label("Total Amount = ");
		l2.setBounds(50,310,200,30);
		add(l2);

		setLayout(null);
		setSize(500,500);
		setVisible(true);

		}

		public void actionPerformed(ActionEvent ae){

            int totalAmount=0;

              totalAmount=Integer.parseInt(t3.getText());
              ae.getSource();

             l2.setText("Total Amount = "+totalAmount+" Rs.");


			}

		public static void main(String[] arg){
			EventEx7 e=new EventEx7();
			}

	}