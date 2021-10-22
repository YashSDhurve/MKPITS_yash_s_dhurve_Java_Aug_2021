import java.awt.*;

class FrameEx6 {

	FrameEx6(){

		Frame fr=new Frame();

		fr.setTitle("MKPITS Solutions");
		fr.setLayout(null);

		Button b1=new Button("OK");
		b1.setBounds(150,80,100,30);
		fr.add(b1);

		fr.setSize(400,400);
		fr.setVisible(true);

		}

	public static void main(String[] arg){
		FrameEx6 f=new FrameEx6();
		}

	}