import java.awt.*;

class FrameEx10 extends Frame{

	FrameEx10(){

		setTitle("MKPITS Solutions");
		setLayout(null);

        Label l1=new Label("SignUp Form");
        l1.setBounds(180,40,100,30);
         add(l1);

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

           Label l4=new Label("Email ");
		   l4.setBounds(50,180,100,30);
			add(l4);

		   TextField tf3=new TextField();
		   tf3.setBounds(70,180,220,25);
		   add(tf3);

		       Label l5=new Label("Mobile no ");
			   l5.setBounds(50,230,100,30);
			   add(l5);

			   TextField tf4=new TextField();
			   tf4.setBounds(70,230,220,25);
		       add(tf4);

		          Button b=new Button("Register");
		          b.setBounds(165,300,100,30);
                  add(b);

		setSize(400,400);
		setVisible(true);

		}

	public static void main(String[] arg){
		FrameEx10 f=new FrameEx10();
		}

	}