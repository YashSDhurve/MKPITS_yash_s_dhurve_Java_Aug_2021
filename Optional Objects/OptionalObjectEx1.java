

public class OptionalObjectEx1 {
    public static void main(String arg[]){

       String s[]=new String[6];
       s[0]="ram";
       s[1]="shyam";

        System.out.println(s[0].toUpperCase());
        System.out.println(s[2]);

        if(s[2]==null){
            System.out.println("no data");
        }
        else{
            System.out.println(s[2].toUpperCase());
        }


    }
}
