//write only class

 class Calculate{
    //private data member
    private float roi;

    public void setRoi(float roi){
    this.roi=roi;                                   //roi=rate of interest
    }
    public float calinterest(float pa,int nom)              //nom=number of months
    {
		float pi=pa * roi * nom;
		return pi;
	}

    }

class TestE9
{
	public static void main(String[] arg) {
		Calculate c=new Calculate();

		c.setRoi(20);

		float ta=c.calinterest(1000,12);
		System.out.println("total amount with interest " + ta);

	}

}
