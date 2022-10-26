package java_array_function;
//Suppose, in a company, here are some employee salaries in an array,
//[35000, 25000, 28000, 32500, 44000, 32800]. Find out the 3rd highest salary.

public class FindThirdHighestSalary {
    public static void main(String[] args) {
        int[] salary = {35000, 25000, 28000, 32500, 44000, 32800};
        int sizeOfSalary = salary.length;
        for (int i = 0; i < sizeOfSalary; i++) {
            for (int j = i + 1; j < sizeOfSalary; j++) {
                if (salary[i] > salary[j]) {
                    int temp = salary[i];
                    salary[i] = salary[j];
                    salary[j] = temp;
                }
            }
        }
        System.out.println("Third highest salary is : " + salary[sizeOfSalary - 3]);
    }
}
