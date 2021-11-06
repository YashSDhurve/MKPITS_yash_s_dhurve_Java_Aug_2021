import javax.swing.*;
import java.awt.event.*;

class SwingEx8 extends JFrame {

			final JLabel l1,l2,l3;
				JTextField t1;
	       JPasswordField p;

	SwingEx8(){

		 l1=new JLabel("Username");
		l1.setBounds(50,80,70,30);
		add(l1);

		 t1=new JTextField();
		t1.setBounds(130,80,200,30);
		add(t1);

		 l2=new JLabel("Password");
		l2.setBounds(50,130,70,30);
		add(l2);

		 p=new JPasswordField();
		p.setBounds(130,130,200,30);
		add(p);

		JButton b1=new JButton("Login");
		b1.setBounds(170,190,80,40);
		add(b1);

		 l3=new JLabel();
		l3.setBounds(40,270,300,50);
		add(l3);

		b1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent ae){

            if(t1.getText().equals("John123@gmail.com") && p.getText().equals("John987*"))
                {
				 l3.setText("Login Successfully");
				}
				else
				{
					l3.setText("Invalid Username or Password");
				}

				}
             });

		setLayout(null);
		setSize(400,400);
		setVisible(true);

		}


		public static void main(String[] arg){
			SwingEx8 s=new SwingEx8();
	}
}