package dummy;

public class ArrayPair {
    /*
   from a given array find all pairs whose sum is a  given number
   {4,6,5,-10,8,5,20}===>10
    */
    public static void main(String[] args) {
        findpairs(new int[]{4, 6, 5, -10, 8, 5, 20}, 10);
        System.out.println("========");
        findpairs(new int[]{4, -5, 9, 11, 25, 13, 12, 8}, 20);
    }
    public static void findpairs(int arr[], int num) {
        for (int x = 0; x < arr.length; x++) {
            for (int z = x + 1; z < arr.length; z++) {
                if (arr[x] + arr[z] == num) {
                    System.out.println(arr[x] + " + " + arr[z] + " = " + num);
                }
            }
        }
    }

}
