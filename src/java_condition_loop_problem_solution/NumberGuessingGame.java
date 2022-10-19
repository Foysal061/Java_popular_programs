package java_condition_loop_problem_solution;
/*A program to generate 2 random within 1 to 20 numbers which will not be shown to the user.
 Taking a user input and match it with any of the random numbers.
 If correct giving it 1 point and if incorrect,not giving it any point.
 Finally, repeating this for 10 times and counting the total points user achieved at the end of 10 cycle.*/

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int points = 0;
            for (int i = 0; i < 10; i++) {
                int randomValue1 = (int) ((Math.random() * (20 - 1)) + 1);
                int randomValue2 = (int) ((Math.random() * (20 - 1)) + 1);
                System.out.println("value of x & y : " + randomValue1 + " " + randomValue2);
                int guessedNumber = sc.nextInt();
                if (guessedNumber == randomValue1 || guessedNumber == randomValue2) {
                    points++;
                }
            }
            System.out.println("Your total point is " + points + "!");
        } catch (Exception error) {
            System.out.println("Invalid input\nPlease enter any integer number\n" + error);
        }
    }
}
