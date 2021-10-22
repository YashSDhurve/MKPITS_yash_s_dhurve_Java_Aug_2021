import java.awt.*;

class FrameEx5 extends Frame{

	FrameEx5(){

		setTitle("MKPITS Solutions");
		setLayout(null);

		Button b1=new Button("OK");
		b1.setBounds(150,80,100,30);
		add(b1);

		setSize(400,400);
		setVisible(true);

		}

	public static void main(String[] arg){
		FrameEx5 f=new FrameEx5();
		}

	}