package java_condition_loop_problem_solution;
//A program to find the sum of numbers which only divisible by 5 from 1 to 100.

public class SumOfNumbersDivisibleBy5 {
    public static void main(String[] args){
        int sum = 0;
        for(int i=1;i<=100;i++){
            if(i%5 == 0){
                sum = sum +i;
            }
        }
        System.out.println("Sum of the numbers which are divisible by 5 within 1 to 100 is = "+sum);
    }
}
