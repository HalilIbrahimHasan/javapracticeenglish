package dummy;

public class FibonacciSequence {


    public static void main(String[] args) {

        /*
        Type a program that will print all Fibonacci Sequence on the console
        0, 1, 1, 2, 3, 5, 8 etc..
         */

        int n = 10, firstTerm = 0, secondTerm = 1;

        fibonacciOrder();
//        System.out.println("Fibonacci Series till " + n + " terms:");
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print(firstTerm + ", ");//0,
//
//            // compute the next term
//            int nextTerm = firstTerm + secondTerm;
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//        }
    }



    public static void fibonacciOrder(){

        int n = 10; int firstTerm =0; int secondNum = 1;

        //0, 1, 1, 2, 3, 5, 8

        for (int i = 1; i <= n ; i++) {

            System.out.print(firstTerm +", ");

            int temp = firstTerm + secondNum;//1
            firstTerm = secondNum;
            secondNum = temp;

        }




    }
}
