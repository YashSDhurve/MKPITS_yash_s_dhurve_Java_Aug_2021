
import java.awt.*;
import java.awt.event.*;

class CheckboxGroupEx2 extends Frame{

	Label l1,l2;
	CheckboxGroup cbg1,cbg2;
	Checkbox cb1,cb2,cb3,cb4;


	CheckboxGroupEx2(){

		setLayout(null);
		setSize(400,400);
		setVisible(true);
		setTitle("CheckboxGroup Example");

		l1=new Label("Capital of India");
		l1.setBounds(50,150,100,40);
		add(l1);

       cbg1=new CheckboxGroup();

		 cb1=new Checkbox("Delhi",cbg1,true);
		cb1.setBounds(160,150,80,30);
		add(cb1);

		 cb2=new Checkbox("Mumbai",cbg1,false);
		cb2.setBounds(250,150,80,30);
		add(cb2);

		        l2=new Label("Capital of Maharashtra");
		        l2.setBounds(50,200,170,40);
				add(l2);

		        cbg2=new CheckboxGroup();

				 cb3=new Checkbox("Delhi",cbg2,false);
				cb3.setBounds(220,200,80,30);
				add(cb3);

				 cb4=new Checkbox("Mumbai",cbg2,true);
				cb4.setBounds(320,200,80,30);
		         add(cb4);

		Button b=new Button("Submit");
		b.setBounds(150,250,80,40);
		add(b);

			Label l2=new Label("result :  ");
			l2.setBounds(50,330,50,40);
		    add(l2);

		Label l3=new Label(" ");
					l3.setBounds(110,330,200,40);
		    add(l3);

		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){

				int total=0;

				if(cb1.getState()==true)
				total=total+1;

				else
				total=total+0;

				if(cb4.getState()==true)
				total=total+1;

				else
				total=total+0;

				l3.setText("Score out of 2 is "+total);


				}
			});

}

		public static void main(String[] arg){
	   new CheckboxGroupEx2();
			}
	}