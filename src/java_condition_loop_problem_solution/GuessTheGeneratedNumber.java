package java_condition_loop_problem_solution;
//A program to guess a randomly generated number within 5 chances

import java.util.Scanner;

public class GuessTheGeneratedNumber {
    public static void main(String[] args) {
        System.out.println("******************** Welcome to the Guessing Game! ********************");
        System.out.println("******************** A number is already generated. ********************");
        System.out.println("***** To win, you have 5 chances to guess the generated number. *****\n");

        try {
            Scanner sc = new Scanner(System.in);
            int randomValue = (int) ((Math.random() * (100 - 1)) + 1);
            for (int i = 0; i < 5; i++) {
                System.out.println("Please, enter an Integer value that you can guess, between 1 to 100: ");
                int guessedNumber = sc.nextInt();
                if (guessedNumber == randomValue) {
                    System.out.println("Great! You have guessed the correct number.\n");
                    System.out.println("Congratulation!! You win!!");
                    break;
                } else if (guessedNumber > randomValue && guessedNumber <= 100) {
                    System.out.println("Your input is higher than the generated number.\n");
                } else if (guessedNumber < randomValue && guessedNumber >= 1) {
                    System.out.println("Your input is lower than the generated number.\n");
                } else {
                    System.out.println("Please enter an integer number between 1 to 100.\n");
                    i--;
                }
            }
        } catch (Exception error) {
            System.out.println("Invalid input. Please enter an integer number between 1 to 100.\n" + error);
        }
    }
}

