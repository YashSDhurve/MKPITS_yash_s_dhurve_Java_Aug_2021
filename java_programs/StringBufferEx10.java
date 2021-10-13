class StringBufferEx10{

	public static void main(String[] arg){

		StringBuffer sb=new StringBuffer();

		System.out.println(sb.capacity());  //default capacity 16

		sb.append("hello");

        System.out.println(sb.capacity());  // capacity 16

        sb.append("hello my name is yash");

        System.out.println(sb.capacity());  // capacity 34 ie (16*2)+2=34







		}}