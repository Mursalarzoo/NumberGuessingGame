
/*Write a program that picks a random number between 1 and 100.
The user can then repeatedly guess a number, and the program will respond by saying
whether the number is higher, lower, or correct (at which point the game ends)*/    //By Mursal Hosseini


import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {
    public static void main(String[] args) {
        //pick a random number
        Random random = new Random();               //The 'new' operator create a Random (number generator).
        int number = random.nextInt(100);    //The method 'nextInt' generate a random number. In this example, nextInt(100) will be between 1 and 99, including both.
        number += 1;                                //add 1 to 'number'
        //System.out.println(number);               //Testing if the code works to verificere

        System.out.println("Guess a number between 1 and 99");      //Print statement before/outside the while loop, so it does not get repeated serveal times

        //While loop
        while (true) {                                              //Here it says that the while loop continues while its condition here is 'true' or it terminates when the condition becomes 'false'
            Scanner in = new Scanner(System.in);                    //Here we declare a Scanner variable names 'in' and create a Scanner that reads input from System.in
            int userNumber = Integer.parseInt(in.nextLine());       //'Integer.parseInt' reads a string and converts it to an int, in this example it returns an int represented by a value of what the user plot in

            if (number > userNumber) {                              //if the userNumber is lower than the chosen number
                System.out.println("Higher");                       //Print out 'higher'
            }   else if (number < userNumber) {                     //if the userNumber is higher than the chosen number
                System.out.println("Lower");                        //Print out 'lower'
            } else {
                System.out.println("That's correct!");              //The user has guest right, print out 'That's correct'
                break;                                              //break statement exits the loop.
            }

        }

    }

}