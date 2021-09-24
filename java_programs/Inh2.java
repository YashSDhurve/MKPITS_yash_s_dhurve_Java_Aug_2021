

class Employee{

	float salary=40000;

	}

class Programmer extends Employee{

	int bonus=10000;

}

class Inh2{

	public static void main(String[] arg){

		Programmer p=new Programmer();

        //p.salary
		System.out.println(" Programmer salary = "+p.salary);

		//p.bonus;
		System.out.println("Programmer Bonus = "+p.bonus);

	}

}