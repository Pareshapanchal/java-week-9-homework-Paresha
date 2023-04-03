package javahomework_week9;

import java.util.ArrayList;

/**11. Declare following two arrylist and compare it.
 ArrayList<String> c1= new ArrayList<String>();
 c1.add("Red");
 c1.add("Green");
 c1.add("Black");
 c1.add("White");
 c1.add("Pink");
 ArrayList<String> c2= new ArrayList<String>();
 c2.add("Red");
 c2.add("Green");
 c2.add("Black");
 c2.add("Pink");
 *
 */
public class Programme_11_CompareTwoArrayList {
    public static void main(String[] args) {
// array list object created c1
        ArrayList<String> c1 = new ArrayList<>();
        //value added to the list
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        // array list object created c1
        ArrayList<String> c2= new ArrayList<String>();
        //value added to the list
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
      //  c2.add("White");// use this to check match or not match
        c2.add("Pink");
        //Comparing two array list
        if(c1.equals(c2)){
            System.out.println("Match");

        }else {
            System.out.println("Not Match");
        }
    }
}
