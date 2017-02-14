package bootcamp;

import java.util.Scanner;

/**
 * Created by wilsonnorman on 2/8/2017.
 */
public class Lab7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Click a Number To Get To Know The Students");
        String Total = scan.next();


        final int TOTAL_STUDENT = 20;
        int i = 0;
        int getName = 0;
        String repeatStudent = "";

                 String[] Names = {"Lisa", "Parker", "Shaaron", "Dave", "forrest", "Peter", "Kim", "Nathan", "Demarc", "Jackie", "Betty", "John", "Sherry", "Keith", "Robert", "Marlo", "Brandon", "Deon", "Frank", "Jessie"};
                 String[] Foods = {"Shrimp", "Lobster", "Pizza", "Chicken", "potatoes", "Sushi", "Apples", "Candy", "Cookies", "Chips", "Popcorn", "Steak", "Fish", "Tacos", "Pizza", "Turkey", "Ham", "Chili", "Icecream", "Cake"};
                 String[] Hometowns = {"Detroit", "NewYork", "NewOleans", "LA", "Miami", "Dayton", "Chicago", "Detroit", "Flint", "Flint", "Detroit", "NewYork", "NewOrleans", "Chicago", "LA", "LA", "Dayton", "Detroit", "Flint", "Flint"};


        System.out.println("Which student would you like to learn more abou? (Enter a number 1-20");


        do{
            boolean repeaterInput = false;
            System.out.println("Enter a number 1 - 20");

            //Checks for the student's name
            while (!repeaterInput) {
                 getName = scan.nextInt() -1;


                if (getName >= 20 || getName < 0) {
                    System.out.println("That student does not exist. Please try again.");
                } else {
                    System.out.print("Student " + (getName+1 ) + " is " + Names[getName -1] + ". ");
                    System.out.println("What would you like to know about " + (Names[getName-1]) + "?");
                    repeaterInput = true;
                }
            }//Ends the while loop for the student's name

            repeaterInput = false;
            System.out.println("Enter 1 for favorite movie or 2 for hometown");

            //Gives information about the student's hometown or favorite movie
            while (!repeaterInput) {
                int userChoice = scan.nextInt();
                if (userChoice > 2 || userChoice <= 0) {
                    System.out.println("That no by that name exist. Please try again");
                } else if (userChoice == 1) {
                    System.out.println(Foods[getName]);
                    repeaterInput = true;
                } else {
                    System.out.println(Hometowns[getName]);
                    repeaterInput = true;
                }
            }//Ends the while loop for the student's information

            System.out.println("Would like to know more? Enter: Yes or No");
            repeatStudent = scan.next();
        } while(repeatStudent.equalsIgnoreCase("yes"));
        //This loop will start program at the get student's name at the beginning
    }

    //Gets the first name in the string


    }




