
import java.awt.*;
import java.awt.event.*;

class CheckboxEx1 extends Frame{

	CheckboxEx1(){

		setTitle("Checkbox Exmaple");
		setLayout(null);
		setSize(400,400);
		setVisible(true);

	Checkbox cb1=new Checkbox("C++");
	cb1.setBounds(100,100,100,50);
	add(cb1);

	Checkbox cb2=new Checkbox("java",true);
		cb2.setBounds(100,170,100,50);
	add(cb2);

		}

		public static void main(String[] arg){
	  CheckboxEx1 c = new CheckboxEx1();
			}
	}