import java.io.*;

class Student implements Serializable{
int id;
String name;
char batch;

 Student(int id,String name,char batch){
	 this.id=id;
	 this.name=name;
	  this.batch=batch;
 }
}