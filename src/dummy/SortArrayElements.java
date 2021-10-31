package dummy;

import java.util.Arrays;

public class SortArrayElements {


    public static void main(String[] args) {

        /*
        Given the array below, sort array elements in ascending and descending order
         */
        int [] array = {1,24,2,342,123,543,54,3,2};


        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i] >= array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
