import javax.swing.*;
import java.awt.event.*;

class SwingEx9 extends JFrame {

	SwingEx9(){

   final JLabel l1=new JLabel();
   l1.setHorizontalAlignment(JLabel.CENTER);
   l1.setSize(400,100);
   add(l1);

   JCheckBox cb1=new JCheckBox("C++");
   cb1.setBounds(100,150,100,50);
   add(cb1);

   JCheckBox cb2=new JCheckBox("Java");
   cb2.setBounds(100,200,100,50);
   add(cb2);

   cb1.addItemListener(new ItemListener(){
	   public void itemStateChanged(ItemEvent ie){
		   l1.setText("C++ Checkbox"+(ie.getStateChange()==1?" Checked ":" Unchecked "));
		   }
	   });

   cb2.addItemListener(new ItemListener(){
	   public void itemStateChanged(ItemEvent ie){
		   l1.setText("Java Checkbox"+(ie.getStateChange()==1?" Checked ":" Unchecked "));
		   }
	   });

		setLayout(null);
		setSize(500,500);
		setVisible(true);

		}


		public static void main(String[] arg){
			SwingEx9 sw=new SwingEx9();
	}
}