package java_condition_loop_problem_solution;
//A program to detect the inputted letter is in uppercase or in lowercase

import java.util.Scanner;

public class DetectCaseOfLetter {
    public static void main(String[] args) {
        System.out.println("Input a character: ");
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);

        System.out.println("Character is: " + letter);

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println(letter + " is in upper case letter ");
        } else if (letter >= 'a' && letter <= 'z') {
            System.out.println(letter + " is in lower case letter");
        } else {
            System.out.println(letter + " is not an alphabet");
        }
    }
}