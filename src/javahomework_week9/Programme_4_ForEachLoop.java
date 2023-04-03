package javahomework_week9;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_ForEachLoop {
    //Main method created
    public static void main(String[] args) {
  //arraylist created to store string values
        List<String> colours = new ArrayList<>();
        //colours are added to the string
        colours.add("Red");
        colours.add("White");
        colours.add("Orange");
        colours.add("yellow");
        System.out.print("Colour in the List:--> ");
        //print the colours using foreach loop
        for (String col:colours) {
            System.out.print(col+" , ");
        }
    }
}
