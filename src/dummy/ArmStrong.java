package dummy;

import java.util.Scanner;

public class ArmStrong {

    /*
    If a number equals to the sum of the cube of its every digit it is called Armstrong Number:
    For example 153 is an Armstrong number. 153= 1+125+27 which is equal to 1^3+5^3+3^3.
    You need t write a program to check is the given number is Armstrong number or not
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number if it is a Armstrong number or not");
        int n = scan.nextInt();

        int sumOfCubes = 0;
        int temp=n;
        int digit =0;

        while(n>0){
            digit = n%10;
            sumOfCubes=sumOfCubes+digit*digit*digit;
            n= n/10;
        }
        if (temp==sumOfCubes){
            System.out.println(temp+" is an Armstrong number");
        }else{
            System.out.println(temp+" is not an Armstrong number");
        }

    }
}
