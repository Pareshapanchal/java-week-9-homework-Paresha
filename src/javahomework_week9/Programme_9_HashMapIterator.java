package javahomework_week9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMapIterator {
    // main method created
    public static void main(String[] args) {
        //HasMap objec created called people
        Map<String,Integer> people = new HashMap<>();
        //key and value added to the map
        people.put("Rishi",1);
        people.put("Rohan",2);
        people.put("Rahil",3);
        people.put("Raj",4);
        people.put("Rihan",5);
        people.put("Roshan",6);
        //iterator object created called listOfPeople
        Iterator<Map.Entry<String,Integer>> listOfPeople = people.entrySet().iterator();
        //while loop created to print in map with the help of iterator
        while(listOfPeople.hasNext()){
            System.out.println(listOfPeople.next());
        }
    }
}
