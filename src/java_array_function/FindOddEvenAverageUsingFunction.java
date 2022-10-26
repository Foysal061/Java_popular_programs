package java_array_function;
//Take 5 numbers/ n numbers from users in an array. Then find out the average number,
//how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers().

import java.util.Scanner;

public class FindOddEvenAverageUsingFunction {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array size: ");
            int arr_size = sc.nextInt();
            int[] arr = new int[arr_size];
            if(arr_size>0){
                for (int i = 0; i < arr_size; i++) {
                    System.out.print("Enter element #" + (i + 1) + ": ");
                    arr[i] = sc.nextInt();
                }
                System.out.println("Average of the numbers is: " + findAverage(arr, arr_size));
                System.out.println("Number of even numbers are: " + findEvenCount(arr, arr_size));
                System.out.println("Number of odd numbers are: " + findOddCount(arr, arr_size));
            }else {
                System.out.println("Array size cannot be zero.");
            }

        } catch (Exception error) {
            System.out.println("Invalid input!\nplease enter integer number.\n" + error);
        }
    }


    //Functions
    //Find average of number from array
    private static double findAverage(int[] arr, int arr_size) {
        double avg;
        int sum = 0;
        for (int i = 0; i < arr_size; i++) {
            sum = sum + arr[i];
        }
        avg = sum / (double) arr_size;

        return avg;
    }

    //Find number of even numbers from array
    private static int findEvenCount(int[] arr, int arr_size) {
        int numberOfEven = 0;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] % 2 == 0) {
                numberOfEven++;
            }
        }
        return numberOfEven;
    }

    //Find number of odd numbers from array
    private static int findOddCount(int[] arr, int arr_size) {
        int numberOfOdd = 0;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] % 2 != 0) {
                numberOfOdd++;
            }
        }
        return numberOfOdd;
    }
}
