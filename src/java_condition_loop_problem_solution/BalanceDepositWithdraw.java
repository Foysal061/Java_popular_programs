package java_condition_loop_problem_solution;
//A program to check balance, deposit balance and withdraw balance from ATM booth.

import java.util.Scanner;

public class BalanceDepositWithdraw {
    public static void main(String[] args) {
        try {
            double currentBalance = 0.0;
            double depositAmount;
            double withdrawAmount;
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("\t\t\tEnter 1 to check balance\n\t\t\tEnter 2 to deposit balance\n\t\t\tEnter 3 to withdraw balance");
                System.out.println("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Your available balance is : " + currentBalance);
                        break;
                    case 2:
                        System.out.println("Enter deposit amount: ");
                        depositAmount = sc.nextDouble();
                        sc.nextLine();
                        currentBalance = currentBalance + depositAmount;
                        System.out.println(depositAmount + " BDT is deposited successfully.");
                        break;
                    case 3:
                        System.out.println("Enter withdrawal amount: ");
                        withdrawAmount = sc.nextDouble();
                        sc.nextLine();
                        if (withdrawAmount == 0) {
                            System.out.println("Withdrawal amount cannot be 0.00");
                        } else if (currentBalance > withdrawAmount) {
                            currentBalance = currentBalance - withdrawAmount;
                            System.out.println(withdrawAmount + " BDT withdrawal successful.");
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                        break;
                    default:
                        System.out.println("Wrong choice.");
                        break;
                }
                System.out.println("Do you want to continue? (y/n).");
                String e = sc.nextLine();
                if (e.equals("n")) {
                    System.out.println("Thank you for banking with us.");
                    break;
                } else if (e.equals("y")) {
                    continue;
                } else {
                    System.out.println("Invalid input. Thank you for banking with us.\n");
                    break;
                }
            }
        } catch (Exception error) {
            System.out.println("Invalid input. Please your choice correctly.\n" + error);
        }
    }
}
