import java.awt.*;
import java.awt.event.*;


class EventEx1 extends Frame implements ActionListener{

EventEx1(){

	Button b1=new Button("ok");
	b1.setBounds(150,150,100,50);
	//register the button component with actionListener
	b1.addActionListener(this);
	add(b1);

	setLayout(null);
	setSize(400,400);
	setVisible(true);

	}

//implementation of actionlistener interface method actionperformed

	public void actionPerformed(ActionEvent ae){
		System.out.println("Hello from the Ok button");
		}

	public static void main(String[] arg){
         EventEx1 e=new EventEx1();
		}

	}