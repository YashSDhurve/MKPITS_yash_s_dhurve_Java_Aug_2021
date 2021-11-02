//Annonymous class Exmaple with 2 Buttons
import java.awt.*;
import java.awt.event.*;

class EventEx14 extends Frame{
	TextField t;
	Button b1,b2;

	EventEx14(){

		setTitle("Annonymous class");
		setLayout(null);
		setSize(400,500);
		setVisible(true);

		t=new TextField();
		t.setBounds(100,100,200,40);
		add(t);

		b1=new Button("Check1");
		b1.setBounds(150,170,100,30);

        b1.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					t.setText("Annonymous class Exmaple2.0");
					                                    }
					            }
					);

       add(b1);

		b2=new Button("Check2");
		b2.setBounds(270,170,100,30);

        b2.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					t.setText("Annonymous class Exmaple2.1");
					                                    }
					            }
					);

       add(b2);

		}

		public static void main(String[] arg){
	  EventEx14 e = new EventEx14();
			}
	}