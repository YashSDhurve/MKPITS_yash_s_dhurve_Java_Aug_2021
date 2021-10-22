import java.awt.*;

class FrameEx8 {

	FrameEx8(){

		Frame fr=new Frame();

		fr.setTitle("MKPITS Solutions");
		fr.setLayout(null);

        Label l1=new Label("MKPITS Solutions");
        l1.setBounds(150,40,100,30);                        //where setBounds(x,y,w,h);     :. x=distance from left,y=dist from top,
         fr.add(l1);                                                                            //w=width from label and h=height of label

        Label l2=new Label("Username");
		l2.setBounds(50,80,100,30);
         fr.add(l2);

        TextField tf1=new TextField();
        tf1.setBounds(70,85,220,25);
        fr.add(tf1);

        Label l3=new Label("Password");
		l3.setBounds(50,130,100,30);
		fr.add(l3);

		TextField tf2=new TextField();
		tf2.setBounds(70,130,220,25);
        fr.add(tf2);

        Button b=new Button("Login");
        b.setBounds(165,190,100,30);
        fr.add(b);

		fr.setSize(400,400);
		fr.setVisible(true);

		}

	public static void main(String[] arg){
		FrameEx8 f=new FrameEx8();
		}

	}