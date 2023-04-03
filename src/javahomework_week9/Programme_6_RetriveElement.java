package javahomework_week9;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetriveElement {
    //Main method created
    public static void main(String[] args) {
        //ArrayList created
        List<Integer> list = new ArrayList<>();
        // integer value added to the array
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i :list){
            System.out.print(i+",");
        }
        System.out.println();
        // get the particular value from array by giving index number
        System.out.println("Print 4th position number: "+list.get(4));



    }
}
