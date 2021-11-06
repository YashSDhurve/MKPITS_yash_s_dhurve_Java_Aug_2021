import java.awt.*;
import java.awt.event.*;

class KeyEventEx1 extends Frame implements KeyListener
{
	Label l1;
	TextField t1;

KeyEventEx1(){
	setTitle("Key Examples");
    setSize(400,400);
    setLayout(null);
    setVisible(true);

    l1=new Label("Enter characters here ");
    l1.setBounds(10,100,150,30);
    add(l1);

    t1=new TextField();
	    t1.setBounds(160,100,150,30);
	    t1.addKeyListener(this);
    add(t1);

	}

	public static void main(String[]arg){
		KeyEventEx1 k=new KeyEventEx1();
		}

		public void keyPressed(KeyEvent ke){
			System.out.println("Recently typed characters in the TextField are "+ke.getKeyChar());
			}
		public void keyReleased(KeyEvent ke){}
		public void keyTyped(KeyEvent ke){}
}




