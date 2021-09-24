//switch statement
//1- wap to accept a  day number between 1 and 7 and then display the dayname. using switch

import java.util.*;

class Switch1{

    public static void main(String[] arg){

    int dayno;

    Scanner s = new Scanner(System.in);

    System.out.println("enter day number");
    dayno=s.nextInt();

    switch( dayno ){

		case 1:
		System.out.println("Monday");
		break;

		case 2:
		System.out.println("Tuesday");
		break;

		case 3:
		System.out.println("Wednesday");
		break;

		case 4:
		System.out.println("Thursday");
		break;

		case 5:
		System.out.println("Friday");
		break;

		case 6:
		System.out.println("Saturday");
		break;

		case 7:
		System.out.println("Sunday");
		break;

		default:
				System.out.println("invalid day number");
		break;



	}

    }

    }
