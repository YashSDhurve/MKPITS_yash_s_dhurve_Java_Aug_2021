//Student class
//A Java class which has only getter methods.

class Student{

	private String college="KDKCE";
	private float collegeId=444.68f;

public String getCollege(){

	return college;

}

public float getCollegeId(){

	return collegeId;

}

}

class TestE6{

	public static void main(String[] arg){

		Student s = new Student();

		System.out.println(s.getCollege()+"   "+s.getCollegeId());

	}

}




