import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankLoginPage {
    public static void main(String[] args){
        JLabel l1,l2,l3,l4;
        JButton b1;
        JTextField t1,t2;

        JFrame fr=new JFrame("Banking System") ;

        l1=new JLabel("Banking System");
        l1.setBounds(150,20,200,30);
        fr.add(l1);

        l2=new JLabel("Username");
        l2.setBounds(30,80,80,30);
        fr.add(l2);

        t1=new JTextField();
        t1.setBounds(120,80,200,30);
        fr.add(t1);

        l3=new JLabel("Password");
        l3.setBounds(30,140,80,30);
        fr.add(l3);

        t2=new JTextField();
        t2.setBounds(120,140,200,30);
        fr.add(t2);

        b1=new JButton("Login");
        b1.setBounds(150,195,100,40);
        fr.add(b1);

        l4= new JLabel("");
        l4.setBounds(100,245,200,30);
        fr.add(l4);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1.getText().equals("Yash Dhurve") && t2.getText().equals("abc123")){
                    l4.setText("Login successfully");
                }
                else{
                    l4.setText("Invalid username or password");
                }
            }
        });


        fr.setLayout(null);
        fr.setSize(400,400);
        fr.setVisible(true);
    }
}
