package java_string_manipulatioin;
/*
Write a program to convert each 1st char to uppercase from a string
Input: rahim lives in sylhet
Output: Rahim Lives In Sylhet
*/


public class ConversionToUppercase {
    public static void main(String[] args) {
        String sentence = "rahim lives in sylhet";
        String[] words = sentence.split(" ");
        for (String eachWord : words) {
            String newSentence = eachWord.substring(0, 1).toUpperCase() + eachWord.substring(1);
            System.out.print(newSentence + " ");
        }
    }
}
