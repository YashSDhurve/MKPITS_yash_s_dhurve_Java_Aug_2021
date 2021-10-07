import java.io.*;

public class FileDemo{

public static void main(String[] arg){

try{

File file=new File("e:\\FileCreated.txt");


if(file.createNewFile()){
System.out.println("New File is created");
}
else{
System.out.println("File is already exist");
}

}

catch(IOException e){
        e.printStackTrace();
}

}

}