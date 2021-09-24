//Student class
//A Java class which has Write-Only class

class Student{

	private String college;
	private float collegeId;

public void setCollege(String college){

	this.college= college;

}

public void setCollegeId(float collegeId){

	this.collegeId= collegeId;

}

public void display(){

	System.out.println("name of the college: "+college);

	System.out.println("Id of the college= "+collegeId);

}

}

class TestE7{

	public static void main(String[] arg){

		Student s = new Student();

        s.setCollege("KDKCE");
        s.setCollegeId(444.890f);
        s.display();

	}

}




