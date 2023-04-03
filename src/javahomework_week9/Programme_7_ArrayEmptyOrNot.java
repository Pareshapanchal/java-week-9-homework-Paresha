package javahomework_week9;

import java.util.ArrayList;
import java.util.List;

/**
 * 7. Write a Java program to test if an array list is empty or not
 */
public class Programme_7_ArrayEmptyOrNot {
    //Main method
    public static void main(String[] args) {
        //Array list created
        List<Integer> list = new ArrayList<>();
        //value added to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("List of Number before deleting:--> ");
        //for each loop to print arraylist
        for (int i : list) {
            System.out.print(i + ",");
        }
        //delete all the values from array to check whether array is empty or not
        list.clear();
        System.out.println();
        System.out.println("After Deleting:");
        //check whether array is empty or not
        if(list.isEmpty() == true)
            System.out.println("List is Empty(No Value added)");

    }
}
