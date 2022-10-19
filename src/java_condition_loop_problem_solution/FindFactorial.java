package java_condition_loop_problem_solution;
//A program to find the factorial of a given number

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            int factorial = 1;
            if (number == 0) {
                System.out.println("Factorial is : " + factorial);
            } else {
                for (int i = 1; i < number; i++) {
                    factorial = factorial + (factorial * i);
                }
                System.out.println("Factorial is : " + factorial);
            }
        } catch (Exception error) {
            System.out.println("Invalid input, Please enter an integer number\n" + error);
        }
    }
}
