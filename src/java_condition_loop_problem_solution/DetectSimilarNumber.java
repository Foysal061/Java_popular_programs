package java_condition_loop_problem_solution;
//A program to detect two decimal numbers are similar or different up to two decimal places

import java.util.Scanner;

public class DetectSimilarNumber {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two decimal numbers");
            double number1 = sc.nextDouble();
            double number2 = sc.nextDouble();
            double modNumber1 = Math.floor(number1 * 100) / 100;
            double modNumber2 = Math.floor(number2 * 100) / 100;
            if (modNumber1 == modNumber2) {
                System.out.println("The numbers are same.");
            } else {
                System.out.println("The numbers are not same.");
            }
        } catch (Exception error) {
            System.out.println("invalid input, Please enter number\n" + error);
        }
    }
}
