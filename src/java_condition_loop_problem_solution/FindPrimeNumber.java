package java_condition_loop_problem_solution;
//A program to print prime numbers from 2 to n

import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n < 2) {
                System.out.println("Please enter any number above 1");
            } else {
                for (int i = 2; i <= n; i++) {
                    int count = 0;
                    for (int j = 1; j <= i / 2; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    }
                    if (count < 2) {
                        System.out.println(" " + i);
                    }
                }
            }
        } catch (Exception error) {
            System.out.println("Invalid input, Please enter an integer number\n" + error);
        }
    }
}
