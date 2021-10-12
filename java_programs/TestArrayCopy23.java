//Java Program to copy a source array into a destination array in Java

    class TestArrayCopy23{

        public static void main(String[] args){

            //declaring a source array

          char[] copyFrom={'a','b','c','r','Y','A','S','H','a','h','o'};

            //declaring a destination array

           char[] copyTo=new char[4];

            //copying array using System.arraycopy() method

            System.arraycopy(copyFrom ,4,copyTo,0,4);

            //printing the destination array

     System.out.println(String.valueOf(copyTo));
        }
    }
