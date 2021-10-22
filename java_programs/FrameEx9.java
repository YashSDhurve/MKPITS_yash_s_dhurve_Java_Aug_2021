import java.awt.*;

class FrameEx9 extends Frame{

	FrameEx9(){

		Frame fr=new Frame();

		setTitle("MKPITS Solutions");
		setLayout(null);

        Label l1=new Label("MKPITS Solutions");
        l1.setBounds(150,40,100,30);                        //where setBounds(x,y,w,h);     :. x=distance from left,y=dist from top,
         add(l1);                                                                            //w=width from label and h=height of label

        Label l2=new Label("Username");
		l2.setBounds(50,80,100,30);
         add(l2);

        TextField tf1=new TextField();
        tf1.setBounds(70,85,220,25);
        add(tf1);

        Label l3=new Label("Password");
		l3.setBounds(50,130,100,30);
		add(l3);

		TextField tf2=new TextField();
		tf2.setBounds(70,130,220,25);
        add(tf2);

        Button b=new Button("Login");
        b.setBounds(165,190,100,30);
        add(b);

		setSize(400,400);
		setVisible(true);

		}

	public static void main(String[] arg){
		FrameEx9 f=new FrameEx9();
		}

	}