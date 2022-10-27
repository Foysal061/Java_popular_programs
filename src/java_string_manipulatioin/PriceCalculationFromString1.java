package java_string_manipulatioin;
/*
Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee,
then 400 tk will be discounted. After your purchase what will be your total cost?
*/

public class PriceCalculationFromString1 {
    public static void main(String[] args) {
        String str = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?";
        str = str.replaceAll("[\\D]", " ");
        str = str.trim();
        str = str.replaceAll(" + ", " ");
        String[] arr = (str.split(" "));
        double shirtPrice = Double.parseDouble(arr[0]);
        System.out.println("Price of a formal shirt: " + shirtPrice);
        double shareePrice = Double.parseDouble(arr[1]);
        System.out.println("Price of a sharee: " + shareePrice);
        int shirtAmount = Integer.parseInt(arr[2]);
        System.out.println("Shirt purchased: " + shirtAmount);
        int shareeAmount = Integer.parseInt(arr[3]);
        System.out.println("Sharee purchased: " + shareeAmount);
        double discountAmount = Integer.parseInt(arr[4]);
        System.out.println("Available discount: " + discountAmount);
        double totalCost = shirtPrice * shirtAmount + shareePrice * shareeAmount - discountAmount;
        System.out.println("Total cost will be: " + totalCost);
    }
}
