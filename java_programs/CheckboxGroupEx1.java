
import java.awt.*;
import java.awt.event.*;

class CheckboxGroupEx1 extends Frame{

	CheckboxGroupEx1(){

		setLayout(null);
		setSize(400,400);
		setVisible(true);
		setTitle("CheckboxGroup Example");

		Label l1=new Label("Select Gender");
		l1.setBounds(50,150,100,40);
		add(l1);

       CheckboxGroup cbg=new CheckboxGroup();

		Checkbox cb1=new Checkbox("Male",cbg,true);
		cb1.setBounds(120,220,100,30);
		add(cb1);

		Checkbox cb2=new Checkbox("Female",cbg,false);
		cb2.setBounds(220,220,100,30);
		add(cb2);

		Button b=new Button("OK");
		b.setBounds(150,270,80,40);
		add(b);

			Label l2=new Label("info :  ");
			l2.setBounds(50,330,50,40);
		    add(l2);

		Label l3=new Label(" ");
					l3.setBounds(110,330,200,40);
		    add(l3);

		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(cb1.getState()==true){
					l3.setText("Gender selected : Male");
					}

				else if(cb2.getState()==true){
					l3.setText("Gender selected : Female");
					}
				}
			});

}

		public static void main(String[] arg){
	   new CheckboxGroupEx1();
			}
	}