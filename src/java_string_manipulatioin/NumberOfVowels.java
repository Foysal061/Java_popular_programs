package java_string_manipulatioin;
/*5. Write a program that will count how many vowels in the given string:
 Input: "roadtosdet"
 Output: 4
*/

public class NumberOfVowels {
    public static void main(String[] args) {
        String word = "roadtosdet";
        int count = 0;
        for (int i=0; i<word.length();i++){
            char letter = word.charAt(i);
            if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U'){
                count++;
            }
        }
        System.out.println(""+count);
    }
}
