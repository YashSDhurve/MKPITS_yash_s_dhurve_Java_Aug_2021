import java.util.StringTokenizer;

class StringTokenizerEx2{
	public static void main(String[] arg){

		StringTokenizer st=new StringTokenizer("Welcome.to.mkpits.Soutions",".");

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
			}




	}}