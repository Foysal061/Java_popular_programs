package java_string_manipulatioin;
/*Find out how many images are in the given array:
Input: ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
Output: 3
*/

public class NumberOfImagesInArray {
    public static void main(String[] args) {
        String[] files = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
        int count = 0;
        for (String fileName: files){
            if (fileName.contains(".jpg") || fileName.contains(".png")){
                count++;
            }
        }
        System.out.println(""+count);
    }
}
