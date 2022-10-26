package java_string_manipulatioin;
/*Replace "R" from Rahim with "F" from the given String:
Input: Ratul and Rahim live in Rangpur
Output: Ratul and Fahim lives in Rangpur
*/

public class ReplaceCharacterInString {
    public static void main(String[] args) {
        String str = "Ratul and Rahim live in Rangpur";
        String[] strArray = str.split(" ");
        for (String eachWord : strArray) {
            if (eachWord.equals("Rahim")) {
                eachWord = eachWord.substring(0, 1).replace("R", "F") + eachWord.substring(1);
                System.out.print(eachWord + " ");
            } else {
                System.out.print(eachWord + " ");
            }
        }
    }
}
