package java_array_function;
//Take input from a user and check if the number exists in the array.

import java.util.Arrays;
import java.util.Scanner;

public class SearchNumberInArray {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array size: ");
            int arr_size = sc.nextInt();
            int[] arr = new int[arr_size];
            for (int i = 0; i < arr_size; i++) {
                System.out.print("Enter element #" + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter desired number: ");
            int num = sc.nextInt();
            for (int j = 0; j < arr_size; j++) {
                if (arr[j] == num) {
                    System.out.println("Found in the position " + j);
                    break;
                }
            }
            System.out.println("Found no element");
        } catch (Exception error) {
            System.out.println("Invalid input" + error);
        }
    }
}
