//example without static method

class CalculateCube1{

static int cube(int c){

return c*c*c;

}

public static void main(String[] arg){

 int result=CalculateCube1.cube(3);

System.out.println("cube="+result);
}


}