import javax.swing.*;
import java.awt.event.*;

class SwingEx7 {
	public static void main(String[] arg){

		JFrame f=new JFrame("Password Field Exmaple");

		final JLabel label=new JLabel("Username");
		label.setBounds(50,80,70,30);
		f.add(label);

		JTextField t1=new JTextField();
		t1.setBounds(130,80,200,30);
		f.add(t1);

		final JLabel l1=new JLabel("Password");
		l1.setBounds(50,130,70,30);
		f.add(l1);

		JPasswordField p=new JPasswordField();
		p.setBounds(130,130,200,30);
		f.add(p);

		JButton b1=new JButton("Save");
		b1.setBounds(170,190,80,40);
		f.add(b1);

		final JLabel l2=new JLabel();
		l2.setBounds(40,270,300,50);
		f.add(l2);

		b1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent ae){

				String data="Username \n"+t1.getText();

				data+=", Password "+new String(p.getPassword());

				l2.setText(data);

				}

			});



		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);

		}
}