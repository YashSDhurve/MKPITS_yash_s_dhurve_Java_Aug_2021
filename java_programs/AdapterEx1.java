import java.awt.*;
import java.awt.event.*;

class AdapterEx1 extends Frame
{
	AdapterEx1()
	{
		setTitle("Examples of Adapter");
		setSize(400,400);
		setLayout(null);
		setVisible(true);

		addMouseListener(new myMouseAdapter(this));
		addMouseMotionListener(new myMouseMotionAdapter(this));
	}

	public static void main(String[] arg)
	{
		AdapterEx1 a=new AdapterEx1();
	}
}

class myMouseAdapter extends MouseAdapter
{
	AdapterEx1 ad;

	myMouseAdapter(AdapterEx1 ad)
	{
		this.ad=ad;
	}

	public void mouseClicked(MouseEvent me)
	{
		System.out.println("Mouse Clicked "+me.getX()+" , "+me.getY());
	}
}

class myMouseMotionAdapter extends MouseMotionAdapter
{
	AdapterEx1 ad;
	myMouseMotionAdapter(AdapterEx1 ade)
	{
		this.ad=ad;
	}
	public void mouseDragged(MouseEvent me)
	{
		System.out.println("Mouse dragged");
	}
}
