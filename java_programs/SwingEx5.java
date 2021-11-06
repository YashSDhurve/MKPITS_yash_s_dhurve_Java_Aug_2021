import javax.swing.*;
import java.awt.event.*;

class SwingEx5 {

public static void main(String[] arg){

	JFrame f=new JFrame("Swing Button Example");

final JTextField t1=new JTextField();
t1.setBounds(50,50,200,30);
f.add(t1);

JButton b1=new JButton("Print");
b1.setBounds(150,150,100,30);

b1.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
	t1.setText("Hello from Swing Button");
		}
	});

f.add(b1);

f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
}

}