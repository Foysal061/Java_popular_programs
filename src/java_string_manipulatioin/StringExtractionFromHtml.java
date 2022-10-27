package java_string_manipulatioin;
/*Extract the transaction ID from the following HTML body
Input:
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>

Output: TXN123456
 */


public class StringExtractionFromHtml {
    public static void main(String[] args) {
        try {
            String htmlBody = "<html>\n" +
                              "<title>Test</title>\n" +
                              "<body>\n" +
                              "Your trnx is successful. Trnx Id is: TXN123456\n" +
                              "</body>\n" +
                              "</html>";
            htmlBody = htmlBody.replaceAll("\\D"," ");
            htmlBody = htmlBody.trim();

            //System.out.println(htmlBody.substring(htmlBody.indexOf(":"),htmlBody.indexOf(" ")));
            System.out.println("TXN"+htmlBody);
        } catch (Exception error){
            System.out.println("\n "+error);
        }
    }
}
