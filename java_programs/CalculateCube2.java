//main inside another class

class CalculateCube2{

static int cube(int c){

return c*c*c;

}


}



class TestCube2{

	public static void main(String[] arg){

		int result=CalculateCube2.cube(5);

		System.out.println("cube"+result);
	}

}

