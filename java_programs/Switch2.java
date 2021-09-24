//switch statement
//2- wap to accept 2 no. and operator like +,- , * and then display the result using switch.

import java.util.*;

class Switch2{

    public static void main(String[] arg){

    int n1,n2,res;

    char op;

    Scanner s = new Scanner(System.in);

    System.out.println("enter 2 numbers");
    n1=s.nextInt();
    n2=s.nextInt();

    System.out.println("enter operator like +,-,*,/");
    op=sf.next().charAt(0);

        switch(op){

		case '+':
		res=n1+n2;
        System.out.println("result="+res);
		break;

        case '-':
	    res=n1-n2;
	    System.out.println("result="+res);
		break;

		case '*':
		res=n1*n2;
		System.out.println("result="+res);
		break;

		case '/':
		res=n1/n2;
		System.out.println("result="+res);
		break;

		default:
		System.out.println("invalid operator");
		break;

	}

    }

    }
