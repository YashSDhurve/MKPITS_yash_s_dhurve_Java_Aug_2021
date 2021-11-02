
import java.awt.*;
import java.awt.event.*;

class CheckboxEx2 extends Frame{

	CheckboxEx2(){

		setTitle("Checkbox Exmaple");
		setLayout(null);
		setSize(400,400);
		setVisible(true);

	Checkbox cb1=new Checkbox("C++");
	cb1.setBounds(100,100,100,50);
	add(cb1);

	Checkbox cb2=new Checkbox("Java");
		cb2.setBounds(100,150,100,50);
	add(cb2);

	final Label fl=new Label();
	fl.setAlignment(fl.CENTER);
	fl.setSize(400,100);
	add(fl);

	cb1.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent ie){
		fl.setText("C++ Checkbox1 : "+(ie.getStateChange()==1?"Checked":"Unchecked"));
		}

		});

	cb2.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent ie){
			fl.setText("Java Checkbox2 :"+(ie.getStateChange()==1?"Checked":"Unchecked"));
         }

         });

	}

		public static void main(String[] arg){
	   new CheckboxEx2();
			}
	}