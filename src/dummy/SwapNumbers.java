package dummy;

import java.util.Scanner;

public class SwapNumbers {

    //swap 2 numbers

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        double int1 = scan.nextDouble();
        double int2 = scan.nextDouble();

        //creating a container
        System.out.println("Before swapping "+ int1+" - "+int2);
        double int3 = int1;
        int1 = int2;
        int2 = int3;
        System.out.println("After swapping "+ int1+" - "+ int2);

        System.out.println("Before swapping "+ int1+" - "+int2);
        int1 = int1+ int2;
        int2 = int1 - int2;
        int1 = int1- int2;
        System.out.println("After swapping "+ int1+" - "+ int2);
    }
}
