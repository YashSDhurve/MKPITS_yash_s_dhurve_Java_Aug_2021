import java.util.StringTokenizer;

class StringTokenizerEx1{
	public static void main(String[] arg){

		StringTokenizer st=new StringTokenizer("Welcome to mkpits"," ");

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
			}




	}}