//You need to calculate the electricity bill based on the below parameters
//Input parameters will be
//Usage in units
//The bill will be calculated as per below slab
//0-100 units (Rs. 3.44 per unit)
//101-300 units (Rs. 7.34 per unit)
//301-500 units (Rs. 10.36 per unit)
//501-1000 units (Rs. 11.82 per unit)
//>1000 units (Rs. 11.82 per unit)
//Apart from the above slab, there are few fixed costs added to each bill as below
//Mandatory Cost: Rs. 200
//Vehicle Cost @ 1.38 per unit
//Tax @ 16% on total cost

import java.util.*;

class ElectricityBill
{
	static public void main(String[] arg)
	{
		float units,cost_without_tax,total_cost;

		Scanner s = new Scanner(System.in);

		System.out.println("enter electricity units use by the customer per month");
		units= s.nextFloat();

		if(units>0 && units<=100)
		{
		cost_without_tax=(float) (units * 3.44f) + 200.0f + (units * 1.38f);
		total_cost=(float) (cost_without_tax) + (cost_without_tax * 0.16f);

	    }

 else if(units>=101 && units<=300)
		{
		cost_without_tax=(float) (units * 7.34f) + 200.0f + (units * 1.38f);
		total_cost=(float) (cost_without_tax) + (cost_without_tax * 0.16f);

	    }

else if(units>=301 && units<=500)
		{
		cost_without_tax=(float) (units * 10.36f) + 200.0f + (units * 1.38f);
		total_cost=(float) (cost_without_tax) + (cost_without_tax * 0.16f);

	    }

    if(units>=501)
		{
		cost_without_tax=(float) (units * 11.82f) + 200.0f + (units * 1.38f);
		total_cost=(float) (cost_without_tax) + (cost_without_tax * 0.16f);

	    }

	    System.out.println("total cost in rupees= "+ total_cost);

  }

}