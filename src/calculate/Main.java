package calculate;

import java.util.Scanner;

public class Main {//2. Create two class with name “Calculator” and “Main”
    /*
    4. Write a “main” method into the main class. It has a scanner that takes
 user input. Also write the logic that it ask user to “Enter first Number:”,
 “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 other symbols.
     */
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        Calculator calculator = new Calculator();//scanner object created
        char answer;
        try {
            do {
                System.out.print("Enter first Number: ");
                int number1 = scanner.nextInt();//Read first number
                System.out.print("Enter second Number: ");
                int number2 = scanner.nextInt();//read second number
                System.out.print("Please enter one of symbol +,-,*,/: ");
                char symbol = scanner.next().charAt(0);//read symbol
                System.out.println("---------------------------------------------------------------");
                calculator.calculateResult(number1, number2, symbol);//method calling from Calculator class
                System.out.println("---------------------------------------------------------------");
                //give user a chance to do more calculation
                System.out.print("Would you like to do more calculation Please enter\"Y\" or\"N\": ");
                answer = scanner.next().charAt(0);
            } while (answer == 'y' || answer == 'Y');
        }
        catch (Exception e)// it will catch error if occurs during calculation
        {
            System.out.println("Please enter valid entry");
        }
          //scanner object closed
        scanner.close();
    }
}
