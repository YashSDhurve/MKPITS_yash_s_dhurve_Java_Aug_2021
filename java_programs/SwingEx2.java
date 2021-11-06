import javax.swing.*;
import java.awt.event.*;

class SwingEx2 {


public static void main(String[] arg){

JFrame f1=new JFrame("Swing Examples");

f1.setLayout(null);
f1.setSize(400,400);
f1.setVisible(true);

JButton b1=new JButton("Save");
b1.setBounds(150,150,100,30);
b1.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){
		System.out.println("Hello from Swing");
		}
	});
f1.add(b1);


}
}