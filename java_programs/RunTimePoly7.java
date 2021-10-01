class Bike{

int speedlimit=90;

}

class RoyalEnfield extends Bike{

int speedlimit=150;

}

class RunTimePoly7{

public static void main(String[] arg){

Bike b= new RoyalEnfield();

System.out.println(b.speedlimit);
}
}

