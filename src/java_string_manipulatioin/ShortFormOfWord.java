package java_string_manipulatioin;
/*
Write a program that will give following output:
Input: Chattogram
Output: C8M
*/

import java.util.Scanner;
public class ShortFormOfWord {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String str = "Chattogram";
//        System.out.print("Enter a word: ");
//        String str = sc.nextLine();           //Take input from user
        int size = str.length();
        String firstLetter = str.substring(0, 1).toUpperCase();
        String lastLetter = str.substring(size - 1, size).toUpperCase();
        System.out.println(firstLetter + "" + (size - 2) + lastLetter);
    }
}
