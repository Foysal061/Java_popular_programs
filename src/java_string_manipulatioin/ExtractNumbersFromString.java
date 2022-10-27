package java_string_manipulatioin;
/*
Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?
 */

public class ExtractNumbersFromString {
    public static void main(String[] args) {
        String str = "Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?";
        str = str.replaceAll("[\\D]", " ");
        str = str.trim();
        str = str.replaceAll(" + ", " ");
        String[] arr = (str.split(" "));
        double laptopPrice = Double.parseDouble(arr[1]);
        double discountPercentage = Double.parseDouble(arr[2]);
        double totalCost = laptopPrice - (laptopPrice*(discountPercentage/100));
        System.out.println(totalCost);
    }
}
