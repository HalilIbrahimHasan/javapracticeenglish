package dummy;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {


    public static void main(String[] args) {

          /*
    Create a function that takes an array ad returns the difference between the biggest and the smallest number.
    Ask user to enter array elements
     */

            Scanner scan = new Scanner(System.in);
            System.out.println(" enter the length of the array");
            int len = scan.nextInt();
            int[] arr = new int[len];
            System.out.println("Enter " + len + " array elements");
            for (int x = 0; x < len; x++) {
                arr[x] = scan.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            int difBetBigAndSmall = arr[len - 1] - arr[0];
            System.out.println(difBetBigAndSmall);








    }
}
