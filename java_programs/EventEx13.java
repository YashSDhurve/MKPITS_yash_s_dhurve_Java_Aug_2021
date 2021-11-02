//Anonymous class Exmaple
import java.awt.*;
import java.awt.event.*;

class EventEx13 extends Frame{
	TextField t;
	Button b;

	EventEx13(){

		setTitle("Anonymous class");
		setLayout(null);
		setSize(400,500);
		setVisible(true);

		t=new TextField();
		t.setBounds(100,100,200,40);
		add(t);

		b=new Button("Check");
		b.setBounds(150,170,100,30);

        b.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					t.setText("Anonymus class Exmaple");
					                                    }
					            }
					);

		add(b);

		}

		public static void main(String[] arg){
	  EventEx13 e = new EventEx13();
			}
	}