package dummy;

import java.util.Random;
import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int myNum = scan.nextInt();

        System.out.println(num);

        for (int i=0 ; i<3;i++){

            if(num == myNum){
                System.out.println("Amazing you found the lucky number");
            }else if (myNum > num){
                System.out.println("Please try a bigger number");
                myNum = scan.nextInt();
            }

        }



    }
}
