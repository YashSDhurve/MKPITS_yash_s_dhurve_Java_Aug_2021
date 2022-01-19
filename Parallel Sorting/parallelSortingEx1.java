import java.util.Arrays;

public class parallelSortingEx1 {
    public static void main(String args[]){
        int numbers[] ={22,12,2,3,54,87,9};

        //parallel sort method for sorting int array

        Arrays.parallelSort(numbers);
        for(int i:numbers){
            System.out.println(i);
        }

        System.out.println("------------------------------");

        Arrays.parallelSort(numbers,1,5);
        for(int i:numbers){
            System.out.println(i);
        }

    }

}
