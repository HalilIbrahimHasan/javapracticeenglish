package dummy;

import java.util.*;
import java.util.Scanner;

public class DuplicateElementsList {

    /*
   create  a list by getting the list elements from user
   if there is duplicated elements remove them from the list
   ask user to stop if they are done with words as
   Enter list elements, to stop entrance press '*'
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter list elements, to stop entrance press '*'");
        String str = "";
        List<String> list = new ArrayList<>();
        while (!str.equals("*")){
            str = scan.next();
            if (!str.equals("*")){
                list.add(str);
            }
        }
        System.out.println(list);
        Set<String> uniquelist = new HashSet<>(list);
        System.out.println(uniquelist);
    }
}
