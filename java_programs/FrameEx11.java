import java.awt.*;

class FrameEx11 extends Frame {

	FrameEx11(){

       setLayout(null);

       TextField t1=new TextField();
       t1.setBounds(20,40,260,70);
       add(t1);

       Button b1=new Button("1");
       b1.setBounds(20,130,80,50);
       add(b1);

           Button b2=new Button("2");
	       b2.setBounds(110,130,80,50);
           add(b2);

                   Button b3=new Button("3");
		   	       b3.setBounds(200,130,80,50);
                   add(b3);


    Button b4=new Button("4");
       b4.setBounds(20,200,80,50);
       add(b4);

           Button b5=new Button("5");
	       b5.setBounds(110,200,80,50);
           add(b5);

                   Button b6=new Button("6");
		   	       b6.setBounds(200,200,80,50);
                   add(b6);


     Button b7=new Button("7");
	       b7.setBounds(20,270,80,50);
	       add(b7);

	           Button b8=new Button("8");
		       b8.setBounds(110,270,80,50);
	           add(b8);

	                   Button b9=new Button("9");
			   	       b9.setBounds(200,270,80,50);
                   add(b9);


    Button b10=new Button("+");
	       b10.setBounds(20,340,80,50);
	       add(b10);

	           Button b11=new Button("0");
		       b11.setBounds(110,340,80,50);
	           add(b11);

	                   Button b12=new Button("=");
			   	       b12.setBounds(200,340,80,50);
                   add(b12);


  Button b13=new Button("-");
	       b13.setBounds(20,410,80,50);
	       add(b13);

	           Button b14=new Button("C");
		       b14.setBounds(110,410,80,50);
	           add(b14);

	                   Button b15=new Button("*");
			   	       b15.setBounds(200,410,80,50);
                   add(b15);




		setSize(300,500);
		setVisible(true);

		}

	public static void main(String[] arg){
		FrameEx11 f=new FrameEx11();
		}

	}