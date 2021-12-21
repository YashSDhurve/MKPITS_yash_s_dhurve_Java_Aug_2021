public class PalindromeEx3 {
    public static void main(String[] arg) {
        String oriName = "madam";
        String revName = "";

        StringBuilder sb = new StringBuilder(oriName);

        sb.reverse();

        revName=sb.toString();

        System.out.println("Original Name :"+oriName);
        System.out.println("Reversed Name :"+sb);

        if(oriName.equals(revName)){
            System.out.println(oriName+" is Palindrome");
        }else{
            System.out.println(oriName+" is not Palindrome");
        }


    }

}
