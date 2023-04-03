package javahomework_week9;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Programme_8_HashSet {
    //main method created
    public static void main(String[] args) {

        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add all the values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);


        // for loop created to check each numbers in the array are come  between 1 to 10
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {// contains method will check each number in the array
                System.out.println(i + " Is in the set");
            }else {
                System.out.println(i+ " Not in the set");
            }
        }
    }
}
