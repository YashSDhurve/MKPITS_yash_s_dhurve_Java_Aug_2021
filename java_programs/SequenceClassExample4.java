import java.io.*;

import java.util.*;

class SequenceClassExample4{

	public static void main(String[] arg)throws Exception{

    FileInputStream fis1=new FileInputStream("e:\\a.txt");
    FileInputStream fis2=new FileInputStream("e:\\b.txt");
    FileInputStream fis3=new FileInputStream("e:\\c.txt");
    FileInputStream fis4=new FileInputStream("e:\\d.txt");

    FileOutputStream fos=new FileOutputStream("e:\\a+b+c+d.txt");

    //creating vector elements of FileInputStream

    Vector v=new Vector();

    v.add(fis1);
    v.add(fis2);
    v.add(fis3);
    v.add(fis4);

    Enumeration e=v.elements();

    SequenceInputStream sis=new SequenceInputStream(e);

    int i;

    while((i=sis.read())!=-1){

		fos.write(i);

		}

		sis.close();

		fos.close();

		fis1.close();
		fis2.close();

      System.out.println("Success");

	}
	}