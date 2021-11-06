import java.awt.*;
import java.awt.event.*;

class KeyAdapterEx1 extends Frame{
	Label l1;
	TextField t1;

KeyAdapterEx1(){
	setTitle("Key Examples");
    setSize(400,400);
    setLayout(null);
    setVisible(true);

    l1=new Label("Enter characters here ");
    l1.setBounds(10,100,150,30);
    add(l1);

    t1=new TextField();
	    t1.setBounds(160,100,150,30);
    add(t1);


	        t1.addKeyListener(new myKeyAdapter(this));

	}

	public static void main(String[]arg){
		KeyAdapterEx1 k=new KeyAdapterEx1();
		}

}

class myKeyAdapter extends KeyAdapter{
	KeyAdapterEx1 ka;

	myKeyAdapter(KeyAdapterEx1 ka){
	this.ka=ka;
	}

		public void keyTyped(KeyEvent ke){
			System.out.println("key typed");
			}
		}






