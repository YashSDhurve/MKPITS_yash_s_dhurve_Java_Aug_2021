import javax.swing.*;
import java.awt.event.*;

class SwingCalculator10 extends JFrame {

	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;

	int num1,pnum=0;

	int res=0;

	String op=null;

	SwingCalculator10(){

		setTitle("Calculator");

    t1 =new JTextField();
   	t1.setBounds(10,20,310,80);
   	add(t1);

    	b1=new JButton("1");
    	b1.setBounds(20,120,90,50);
    	add(b1);

   	   	b2=new JButton("2");
	   	b2.setBounds(120,120,90,50);
    	add(b2);

   	   	b3=new JButton("3");
	   	b3.setBounds(220,120,90,50);
    	add(b3);

    	b4=new JButton("4");
		b4.setBounds(20,180,90,50);
    	add(b4);

   	   	b5=new JButton("5");
	   	b5.setBounds(120,180,90,50);
    	add(b5);

   	   	b6=new JButton("6");
	   	b6.setBounds(220,180,90,50);
    	add(b6);

    	b7=new JButton("7");
		b7.setBounds(20,240,90,50);
    	add(b7);

   	   	b8=new JButton("8");
	   	b8.setBounds(120,240,90,50);
    	add(b8);

   	   	b9=new JButton("9");
	   	b9.setBounds(220,240,90,50);
    	add(b9);

   	   	b10=new JButton("+");
	   	b10.setBounds(20,300,90,50);
    	add(b10);

   	   	b11=new JButton("0");
	   	b11.setBounds(120,300,90,50);
    	add(b11);

   	   	b12=new JButton("-");
	   	b12.setBounds(220,300,90,50);
    	add(b12);

   	   	b13=new JButton("*");
	   	b13.setBounds(20,360,90,50);
    	add(b13);

   	   	b14=new JButton("=");
	   	b14.setBounds(120,360,90,50);
    	add(b14);

   	   	b15=new JButton("/");
	   	b15.setBounds(220,360,90,50);
    	add(b15);

    	b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/") ){
					t1.setText("1");
					}
					else
					{
						t1.setText(t1.getText()+"1");
					}
				}
			});

    	b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/") ){
					t1.setText("2");
					}
					else
					{
						t1.setText(t1.getText()+"2");
					}
				}
			});

    	b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/") ){
					t1.setText("3");
					}
					else
					{
						t1.setText(t1.getText()+"3");
					}
				}
			});

    	b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/") ){
					t1.setText("4");
					}
					else
					{
						t1.setText(t1.getText()+"4");
					}
				}
			});

    	b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/") ){
					t1.setText("5");
					}
					else
					{
						t1.setText(t1.getText()+"5");
					}
				}
			});

    	b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/") ){
					t1.setText("6");
					}
					else
					{
						t1.setText(t1.getText()+"6");
					}
				}
			});

    	b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/") ){
					t1.setText("7");
					}
					else
					{
						t1.setText(t1.getText()+"7");
					}
				}
			});

    	b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/") ){
					t1.setText("8");
					}
					else
					{
						t1.setText(t1.getText()+"8");
					}
				}
			});

    	b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/") ){
					t1.setText("9");
					}
					else
					{
						t1.setText(t1.getText()+"9");
					}
				}
			});


    	b11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/") ){
					t1.setText("0");
					}
					else
					{
						t1.setText(t1.getText()+"0");
					}
				}
			});

    	b10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){

				pnum=Integer.parseInt(t1.getText());
				t1.setText("+");
				op="+";

				}
			});


    	b12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){

				pnum=Integer.parseInt(t1.getText());
				t1.setText("-");
				op="-";

				}
			});

    	b13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){

				pnum=Integer.parseInt(t1.getText());
				t1.setText("*");
				op="*";

				}
			});

    	b15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){

				pnum=Integer.parseInt(t1.getText());
				t1.setText("/");
				op="/";

				}
			});

    	b14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){

			num1=Integer.parseInt(t1.getText());

			if(op=="+"){
				res= pnum+num1;
				t1.setText(String.valueOf(res));
				}

			if(op=="-"){
				res= pnum-num1;
				t1.setText(String.valueOf(res));
				}

			if(op=="*"){
				res= pnum*num1;
				t1.setText(String.valueOf(res));
				}

			if(op=="/"){
				res= pnum/num1;
				t1.setText(String.valueOf(res));
				}

				}
			});


		setLayout(null);
		setSize(350,500);
		setVisible(true);

		}


		public static void main(String[] arg){
			SwingCalculator10 sw=new SwingCalculator10();
	}
}