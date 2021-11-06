import javax.swing.*;

class SwingEx1 {
public static void main(String[] arg){

JFrame f1=new JFrame("Swing Examples");

f1.setLayout(null);
f1.setSize(400,400);
f1.setVisible(true);

JButton b1=new JButton("Click");
b1.setBounds(150,150,100,30);
f1.add(b1);


}
}