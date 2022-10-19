package java_condition_loop_problem_solution;
/*a program to enter the numbers till the user wants and at the end,
 to display the largest and smallest numbers user entered.*/

import java.util.Objects;
import java.util.Scanner;

public class FindLargestAndSmallestNumber {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int min = 999999999;
            int max = -999999999;

            while (true) {
                String e = sc.nextLine();
                if (Objects.equals(e, "q")) {
                    break;
                } else {
                    int n = Integer.parseInt(e);
                    if (n >= max) {
                        max = n;
                    }
                    if (n <= min) {
                        min = n;
                    }
                }
            }
            System.out.println("The largest number is: " + max);
            System.out.println("The smallest number is: " + min);
        } catch (Exception error) {
            System.out.println("Invalid input\n5please enter any integer number to continue \n\t\t\tor\n enter q to exit\n" + error);
        }
    }
}
