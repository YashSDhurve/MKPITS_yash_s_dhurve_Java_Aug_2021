
import java.awt.*;
import java.awt.event.*;

class CheckboxGroupEx3 extends Frame{

	Label l1,l2;
    TextField t1,t2,t3;
	CheckboxGroup cbg1,cbg2;
	Checkbox cb1,cb2,cb3,cb4;


	CheckboxGroupEx3(){

		setLayout(null);
		setSize(400,400);
		setVisible(true);
		setTitle("CheckboxGroup Example");

		       l1=new Label("Account no.");
		       l1.setBounds(30,100,100,30);
		       add(l1);

		       l2=new Label("Amount = ");
			   l2.setBounds(30,140,100,30);
		       add(l2);

		       t1=new TextField();
		       t1.setBounds(140,100,200,30);
		       add(t1);

		        t2=new TextField();
			    t2.setBounds(140,140,200,30);
		        add(t2);

		        cbg2=new CheckboxGroup();

				 cb3=new Checkbox("Deposit",cbg2,true);
				cb3.setBounds(100,200,80,30);
				add(cb3);

				 cb4=new Checkbox("Withdrawl",cbg2,false);
				cb4.setBounds(200,200,80,30);
		         add(cb4);

		Button b=new Button("Submit");
		b.setBounds(150,250,80,40);
		add(b);

			Label l2=new Label("Balance = ");
			l2.setBounds(50,330,50,40);
		    add(l2);

		Label l3=new Label(" ");
					l3.setBounds(110,330,200,40);
		    add(l3);

		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){

				int amt=Integer.parseInt(t2.getText());

				int bal=1000;

				if(cb3.getState()==true)
				bal=bal+amt;

				else if(cb3.getState()==false)
				bal=bal-amt;

				l3.setText(bal+"Rs.");


				}
			});

}

		public static void main(String[] arg){
	   new CheckboxGroupEx3();
			}
	}