import java.io.*;

public class PushbackInputStreamEx1{

	public static void main(String[] arg)throws Exception{

		String str="1##2#34###12";

		byte[] arr= str.getBytes();

		ByteArrayInputStream  bais=new ByteArrayInputStream(arr);

		PushbackInputStream push=new PushbackInputStream(bais);

		int i;

		while((i=push.read())!=-1){

			if(i=='#'){

				int j;

				if((j=push.read())=='#'){

				System.out.print("**");

				}
				else{
					      push.unread(j);
							System.out.print((char)i);
					}

				}
				else{
					System.out.print((char)i);
					}


			}

		}

	}