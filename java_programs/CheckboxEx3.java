
import java.awt.*;
import java.awt.event.*;

class CheckboxEx3 extends Frame{

	CheckboxEx3(){

		setLayout(null);
		setSize(400,400);
		setVisible(true);
		setTitle("Checkbox Example");

		Label l1=new Label("Enter Number1");
		l1.setBounds(50,100,100,40);
		add(l1);

        Label l2=new Label("Enter Number2");
		l2.setBounds(50,160,100,40);
		add(l2);

		TextField t1=new TextField();
		t1.setBounds(160,100,100,40);
		add(t1);

		TextField t2=new TextField();
	    t2.setBounds(160,160,100,40);
		add(t2);

		Checkbox cb1=new Checkbox("Addition");
		cb1.setBounds(120,220,100,30);
		add(cb1);

		Checkbox cb2=new Checkbox("Substraction");
		cb2.setBounds(220,220,100,30);
		add(cb2);

		Button b=new Button("Calculate");
		b.setBounds(150,270,80,40);
		add(b);

		Label l3=new Label("Result = ");
		l3.setBounds(80,320,80,40);
		add(l3);

		Label l4=new Label(" ");
		l4.setBounds(180,320,100,40);
		add(l4);

		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){

		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t2.getText());

		int res=0;

		StringBuilder sb=new StringBuilder();

		if(cb1.getState()==true){
		res=num1+num2;
		sb.append(res);
	    }

	   if(cb2.getState()==true){
		res=num1-num2;
		sb.append(res);
	    }

	    l4.setText(sb.toString());
				}
			});

}

		public static void main(String[] arg){
	   new CheckboxEx3();
			}
	}