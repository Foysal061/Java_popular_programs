package java_array_function;
//Input an amount from the user and find out the number of notes from input amount in given array
//[1000,500,100,50,20,10,5,2,1].

import java.util.Scanner;

public class NotesCountFromAmount {
    public static void main(String[] args) {
        try{
            int notes[] = {1000,500,200,100,50,20,10,5,2,1};
            System.out.print("Enter amount: ");
            Scanner sc = new Scanner(System.in);
            int amount = sc.nextInt();
            for(int note:notes){
                int noOfNotes = amount / note;
                if(noOfNotes > 0){
                    System.out.println(""+note+" "+noOfNotes);
                }
                amount = amount % note;
            }
        } catch (Exception error){
            System.out.println("Invalid input, please enter integer number.\n"+error);
        }

    }
}
