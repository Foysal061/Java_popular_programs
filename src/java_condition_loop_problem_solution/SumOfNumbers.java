package java_condition_loop_problem_solution;
//A program to sum of user input until users input ‘q’ from keyboard

import java.util.Objects;
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            long sum=0;
            int i=1;
            while (true) {
                String e = sc.nextLine();
                if (Objects.equals(e, "q")) {
                    break;
                }
                else {
                    long n = Integer.parseInt(e);
                    sum = sum + n;
                    if (i == 1) {
                        System.out.println("First number is: " + sum);
                    } else {
                        System.out.println("Summation of " + i + " numbers are: " + sum);
                    }
                    i++;
                }
            }
        } catch (Exception error){
            System.out.println("Invalid input\nPlease enter any integer number to continue \n\t\t\tor\n Enter q to exit\n" + error);
        }
    }
}
