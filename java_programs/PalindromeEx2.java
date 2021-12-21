
public class PalindromeEx2 {
    public static void main(String[] arg){

        String oriName="Nayan";
        String revName="";

        StringBuffer sb=new StringBuffer(oriName);

         sb.reverse();

         revName=sb.toString();

        System.out.println("Reversed Name :"+oriName);
        System.out.println("Original Name :"+sb);


        if(oriName.equals(revName)){
            System.out.println(oriName+" is Palindrome");
        }else{
            System.out.println(oriName+" is not Palindrome");
        }

    }

}
