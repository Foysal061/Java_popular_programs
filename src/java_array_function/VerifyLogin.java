package java_array_function;
/*Suppose a software system excepts valid credentials from user to logged in to the system.
if the user inputs wrong username/password for 3 times, system will say that "You are temporarily locked.".
Let the username: admin, password: adm1n  */

import java.util.Scanner;

public class VerifyLogin {
    public static void main(String[] args) {
        verifyLogin("admin", "adm1n");
    }


    // Function
    private static void verifyLogin(String username, String password){
        Scanner sc = new Scanner(System.in);
        int wrongCredentialCount = 0;
        do {
            System.out.println("\t\t\tPlease Enter Username & Password");
            System.out.print("\t\t\t\t\tUsername: ");
            String un = sc.nextLine();
            System.out.print("\t\t\t\t\tPassword: ");
            String pass = sc.nextLine();

            if (un.equals(username) && pass.equals(password)) {
                System.out.println("\t\t\tLogin Successful !");
                break;
            } else if (un.equals(username) && !pass.equals(password)) {
                System.out.println("\t\t\tPassword is incorrect.");
                wrongCredentialCount++;
                if (wrongCredentialCount == 3) {
                    System.out.println("\t\t\tYou are temporarily locked.");
                    break;
                }
            } else if (!un.equals(username) && pass.equals(password)) {
                System.out.println("\t\t\tUsername is incorrect.");
                wrongCredentialCount++;
                if (wrongCredentialCount == 3) {
                    System.out.println("\t\t\tYou are temporarily locked.");
                    break;
                }
            } else {
                System.out.println("\t\t\tInvalid username and password.");
                wrongCredentialCount++;
                if (wrongCredentialCount == 3) {
                    System.out.println("\t\t\tYou are temporarily locked.");
                    break;
                }
            }
        } while (true);
    }
}
