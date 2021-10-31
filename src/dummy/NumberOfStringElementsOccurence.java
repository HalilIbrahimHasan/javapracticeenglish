package dummy;


import java.util.*;

public class NumberOfStringElementsOccurence {

    /*
  count the words in a string one by one
  String is "Ali came to school and Ayse came to school"
  Ali = 1, came = 2, to = 2, school = 2, Ayse = 1, and = 1
   */
    public static void main(String[] args) {
        String str = "Ali came to school, and Ayse came to Ayse school.";
        String []words = str.split(" ");
//        System.out.println(Arrays.toString(words));
        List<String> wordList = new ArrayList<String>();

        numberOfOccurences();
//        for (String w : words){
//            wordList.add(w.replaceAll("\\W", ""));
//        }
//        System.out.println("List: "+wordList );
//        Map<String, Integer> numOfwords = new HashMap<>();
//        for (String w : wordList){
//            if (numOfwords.containsKey(w)){
//                int count = numOfwords.get(w);
//                System.out.println("num of words: "+numOfwords.get(w));
//                numOfwords.put(w,count+1);
//            }else{
//                numOfwords.put(w,1);
//            }
//        }
//        System.out.println(numOfwords);
    }



    public static void numberOfOccurences(){

        String sentence = "Ibrahim bahcede Ali ile oynuyor. Ibrahim hala bahcede.";


        String [] words = sentence.split(" ");

        System.out.println("words: " + Arrays.toString(words));

        List <String> wordList = new ArrayList<>();

        for (String w : words){

            wordList.add(w.replaceAll("\\W", ""));

        }
        System.out.println("extracted words: "+wordList);

        Map<String, Integer> numberOfWords = new HashMap<>();

        for (String w : wordList){


            if(numberOfWords.containsKey(w)){
                int count = numberOfWords.get(w);
                numberOfWords.put(w,count+1);
            }else{
                numberOfWords.put(w,1);
            }



        }

        System.out.println("current repeated word list : "+numberOfWords );




    }
}
