package javahomework_week9;

import java.util.*;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_Iterater {
    //main method created
    public static void main(String[] args) {
     // array list created to store string values
        List< String> employee = new ArrayList();
        // names are added to the string
        employee.add("Jordan");
        employee.add("Josh");
        employee.add("Mike");
        employee.add("Michel");
        employee.add("Zeshan");
        employee.add("Harry");
  // iterator has been used to print employee list
        Iterator<String> employeelist = employee.iterator();
        while (employeelist.hasNext()){
        System.out.print(employeelist.next()+" , ");}
    }

}
