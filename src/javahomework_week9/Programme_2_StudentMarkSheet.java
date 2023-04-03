package javahomework_week9;

import java.util.ArrayList;
import java.util.Scanner;

/**2. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
 /*2. Rewrite the student mark sheet programme (From java-homework-week3
programmes) using if else and while loop.
 */

public class Programme_2_StudentMarkSheet {
    //Main method
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);//scanner object created
        // create array list to store whole class marks and generate whole class marksheet
        ArrayList<Integer> rollNo = new ArrayList<>();
        ArrayList<String> studentName = new ArrayList<>();
        ArrayList<Integer> mathsMark = new ArrayList<>();
        ArrayList<Integer> scienceMark = new ArrayList<>();
        ArrayList<Integer> englishMark = new ArrayList<>();
        ArrayList<Integer> totalMark = new ArrayList<>();
        ArrayList<Integer> percentage = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> grade = new ArrayList<>();
        int rNo,mathMark,sciMark,engMark,number,total,n,percent;

        System.out.print("How many students in the class: ");//read how many sutdents are in the class
            number = scanner.nextInt();
        System.out.println("---------------------------------");
             n = number;
             //while loop created to read all the students information and store in the arraylist
    while (n != 0) {
        System.out.print("Enter Student RollNo: ");
        rNo = scanner.nextInt();
        if (rNo > 0) {  // if statement to check for valid entry
            rollNo.add(rNo);
        } else {
            System.out.print("Enter Positive Number");
            rNo = scanner.nextInt();
        }

        System.out.print("Enter Student Name: ");
        studentName.add(scanner.next());

        System.out.print("Enter Maths Marks: ");
        mathMark = scanner.nextInt();

        if (mathMark > 0) {
            mathsMark.add(mathMark);
        } else {
            System.out.print("Enter valid Maths Marks: ");
            mathMark = scanner.nextInt();
            mathsMark.add(mathMark);
        }
        System.out.print("Enter Science Marks: ");
        sciMark = scanner.nextInt();
        if (sciMark > 0) {
            scienceMark.add(sciMark);
        } else {
            System.out.print("Enter valid Science Marks: ");
            sciMark = scanner.nextInt();
            scienceMark.add(sciMark);
        }
        System.out.print("Enter English Marks: ");
        engMark = scanner.nextInt();
        if (engMark > 0) {
            englishMark.add(engMark);
        } else {
            System.out.print("Enter valid English Marks:--> ");
            engMark = scanner.nextInt();
            englishMark.add(engMark);
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        n--;
    }
        for (int i=0; i< number; i++ ){// for loop created to claculate total marks,percentage, grade for all the sutdents
           //if statment to check in any subject if student get less than 35 then they are fail

            if(mathsMark.get(i) <35 || (scienceMark.get(i)<35)||(englishMark.get(i)<35))
            { result.add("Fail");  }
            else{
                result.add("Pass");}

            total =  mathsMark.get(i)+ englishMark.get(i)+ scienceMark.get(i);// total mark calculation
            totalMark.add(total); //total added to the array
            percent = (total*100)/300;//calculate percentage
            percentage.add(percent);//percentage added

            if(percent >=80) {// if statement for calculate the grade of each student
                if(result.get(i) =="Fail") {
                    grade.add("Fail");
                }else {
                    grade.add("A+");
                }
            } else if (percent>=70) {
                if(result.get(i) =="Fail") {
                    grade.add("Fail");
                }else {
                    grade.add("A");
                }

            } else if (percent>=60) {
                if(result.get(i) =="Fail") {
                    grade.add("Fail");
                  }else {
                grade.add("B");
                }
            } else if (percent>=50) {
                if(result.get(i) =="Fail") {
                    grade.add("Fail");
                }else {
                    grade.add("C");
                }
            } else if (percent>=35) {
                if(result.get(i) =="Fail"){
                    grade.add("Fail");
                }else {grade.add("Pass");}

            }else {
                grade.add("Fail");
            }

        }
        //Print marksheet for whole class for teacher reference
        System.out.print("RollNo"+"  |  "+ "Name"+"  |  "+ "Maths"+"  |  "+"Science"+"  |  "+"English"+"  |  "+"TotalMarks"+"  |  ");
        System.out.println("Percentage"+"  |  "+"Result"+"  |  "+"Grade");
        for(int i =0; i<number; i++)
        {
            System.out.print(rollNo.get(i)+"       |  "+ studentName.get(i)+"    |    "+mathsMark.get(i)+"   |    " +scienceMark.get(i)+"   |    "+englishMark.get(i));
            System.out.println("    |    "+ totalMark.get(i)+"    |    "+ percentage.get(i)+"     |    "+ result.get(i)+"     |    "+ grade.get(i));
            System.out.println("-------------------------------------------------------------------------------------------------------------");
        }
        scanner.close();
    }

}

