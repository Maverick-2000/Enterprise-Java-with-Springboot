
/*Print reverse of a sentence */
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputString = scn.nextLine();
        scn.close();
        String[] wordsArray = inputString.split(" ");
        String reverseString = "";
        for (int i = 0; i < wordsArray.length; i++) {
            String word = wordsArray[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord += word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println(reverseString);
    }
}
