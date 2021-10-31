package dummy;

import java.util.Scanner;

public class Palindrome {

    /*
   Palindrome
   Create a program checks if a string is palindrome or not
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.nextLine().replace(" ", "").toLowerCase()  ;

        isPalindrome3(str);

    }
    public static void isPalindrome(String str){
        String revStr = "";
        for (int x = str.length()-1; x>=0;x--){
            revStr = revStr+str.charAt(x);
        }
        if (str.equals(revStr)){
            System.out.println("str is palindrome");
        }else{
            System.out.println("str is not palindrome");
        }

    }


    public static void isPalindrome2(String str){

        StringBuilder stb = new StringBuilder();
        stb.append(str);

        if(stb.toString().equalsIgnoreCase(stb.reverse().toString())){
            System.out.println("It is palindrome: " + stb);
        }else{
            System.out.println("It is not palindrome: " + stb);

        }

    }

    public static void isPalindrome3(String str){

        String reversed = "";


        for (int i = str.length() -1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Current String : "+reversed);

    }
}
