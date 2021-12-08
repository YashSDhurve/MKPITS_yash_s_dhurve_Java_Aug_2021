import java.awt.*;

public class ButtonIntIdea extends Frame {
    Button b;
    ButtonIntIdea(){
        b=new Button("Hello");
        b.setBounds(150,150,50,20);
        add(b);

        setLayout(null);
        setVisible(true);
        setSize(400,400);



    }
    public static void main(String[] args){
        ButtonIntIdea b=new ButtonIntIdea();
    }
}
