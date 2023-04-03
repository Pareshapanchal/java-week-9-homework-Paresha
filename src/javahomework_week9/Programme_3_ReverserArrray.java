package javahomework_week9;
//3. Write a Java program to reverse an array of integer values.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Programme_3_ReverserArrray {
//main method
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();//Arraylist to store integer values
        String ans,ans1="y";int num;
        Scanner scanner = new Scanner(System.in);// scanner object created
        //aks user how many mubers they want to add to the list
        System.out.print("How Many Number do you want to add in the list: ");
                num = scanner.nextInt();
                //while loop will  add the numbers to the array
                while(num!=0){
                    System.out.print("Enter Number: ");
                    number.add(scanner.nextInt());
                    num--;
                }
        System.out.println("\n");
        System.out.println("Numberlist before reverse ");
        System.out.println("----------------------------");
        for(int i=0; i<number.size();i++) {
            System.out.print(number.get(i)+" , ");// read all the numbers in array
        }
        Collections.reverse(number);// reverse the integer arraylist

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Number List after reverse");
              for(int i=0; i<number.size();i++) {
                  System.out.print(number.get(i)+" , ");// read all the numbers in array after reverse
              }
            //closing the scanner object
        scanner.close();
    }
}
