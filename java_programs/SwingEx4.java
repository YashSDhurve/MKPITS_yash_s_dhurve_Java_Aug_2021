import javax.swing.*;
import java.awt.event.*;

class SwingEx4 extends JFrame {

SwingEx4(){


setLayout(null);
setSize(400,400);
setVisible(true);

JButton b1=new JButton("Save");
b1.setBounds(150,150,100,30);
b1.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){
		System.out.println("Hello from Swing");
		}
	});
add(b1);

}

public static void main(String[] arg){
	SwingEx4 s=new SwingEx4();
	}

}