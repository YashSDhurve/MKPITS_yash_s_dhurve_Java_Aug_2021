//Outer class Exmaple 2
import java.awt.*;
import java.awt.event.*;

class EventEx12 extends Frame{
	TextField t;
	Button b;

	EventEx12(){

		setTitle("Outer Ex 2");
		setLayout(null);
		setSize(400,500);
		setVisible(true);

		t=new TextField();
		t.setBounds(100,100,200,40);
		add(t);

		b=new Button("Check");
		b.setBounds(150,170,100,30);

		Outer2 o=new Outer2(this);

		b.addActionListener(o);

		add(b);

		}

		public static void main(String[] arg){
	         new EventEx12();
			}
	}

	//////////////

	class Outer2 implements ActionListener{

		EventEx12 ev;

		Outer2(EventEx12 ev){
			this.ev=ev;
			}

			public void actionPerformed(ActionEvent ae){
				ev.t.setText("Welcome to MKPITS");
				}
		}