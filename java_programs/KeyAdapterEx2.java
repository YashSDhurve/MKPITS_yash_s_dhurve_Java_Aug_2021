import java.awt.*;
import java.awt.event.*;

class KeyAdapterEx2 extends Frame{
	Label l1;
	TextField t1;

KeyAdapterEx2(){
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
		KeyAdapterEx2 k=new KeyAdapterEx2();
		}

}

class myKeyAdapter extends KeyAdapter{
	KeyAdapterEx2 ka;

	myKeyAdapter(KeyAdapterEx2 ka){
	this.ka=ka;
	}

		public void keyTyped(KeyEvent ke){
			System.out.println("key typed");

			char c= ke.getKeyChar();

			System.out.println("Key typed "+c);

			ka.l1.setText(ka.t1.getText());
			}
		}






