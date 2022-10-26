package java_array_function;
/*Create your today's bazaar list/pocket expenditure which includes the item name and price.
Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price.
If found no item, then print message as "No item found" and
create another function named totalSum() which will return total price of items.*/

import java.util.HashMap;
import java.util.Scanner;

public class PocketExpenditureUsingHashmap {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            HashMap<String, Integer> expenditure = new HashMap<String, Integer>();

// Insert static key and value into Hashmap
//        expenditure.put("Potato", 30);
//        expenditure.put("Green Pepper", 200);
//        expenditure.put("Onion", 150);
//        expenditure.put("Lemon", 30);
//        expenditure.put("Orange", 130);
//        expenditure.put("Apple", 180);
//        ------------------------------
// -----------------------------------------------------

// Insert key and value from the user into Hashmap
            System.out.print("Enter number of items: ");
            int numberOfItems = sc.nextInt();
            sc.nextLine();
            if (numberOfItems <= 0) {
                System.out.println("Number of items should be greater than 0.");
            } else {
                for (int i = 0; i < numberOfItems; i++) {
                    System.out.print("Enter the name of item #" + (i + 1) + " : ");
                    String keyItem = sc.nextLine();
                    System.out.print("Enter the price of " + keyItem + " : ");
                    Integer valuePrice = sc.nextInt();
                    sc.nextLine();
                    while (valuePrice <= 0) {
                        System.out.println("Price cannot be 0 or negative.");
                        System.out.print("Again enter the price of " + keyItem + " : ");
                        valuePrice = sc.nextInt();
                        sc.nextLine();
                    }
                    expenditure.put(keyItem, valuePrice);
                }

//------------------------------------------------------------------------------------
                System.out.print("Total price of the items is: " + totalSum(expenditure) + "\n");  //get total price

                System.out.print("Enter any item's name to know the price: ");
                String item = sc.nextLine();
                Integer price = searchItem(expenditure, item);   // get individual price
                if (price == null) {
                    System.out.println("No item found");
                } else {
                    System.out.println("Price of " + item + " is : " + price);
                }
            }
        } catch (Exception error) {
            System.out.println("\nInvalid input\n" + error);
        }
    }

    //Functions
    //Search any item from Hashmap
    public static Integer searchItem(HashMap<String, Integer> expenditure, String key) {
        return expenditure.get(key);
    }

    //Find summation of the values of Hashmap
    public static Integer totalSum(HashMap<String, Integer> expenditure) {
        int sum = 0;
        for (String i : expenditure.keySet()) {
            sum = sum + expenditure.get(i);
        }
        return sum;
    }
}
