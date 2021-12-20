public class PalindromeEx1 {
    public static void main(String[] arg){
        String originalName="nayan";
        String reversedName="";

        System.out.println(originalName);

        int originalLength =originalName.length() ;

        System.out.println(originalLength);

        for(int i= (originalName.length()-1);i>=0;i--){
            reversedName = reversedName+originalName.charAt(i) ;
        }
        System.out.println(reversedName);

        if(originalName.equals(reversedName) ){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}
