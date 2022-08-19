
/*Count special characters */
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputString = scn.nextLine();
        scn.close();
        int splChars = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (!Character.isLetter(inputString.charAt(i)) && !Character.isDigit(inputString.charAt(i))
                    && !Character.isWhitespace(inputString.charAt(i)))
                splChars++;
        }
        System.out.println("The number of special characters: " + splChars);
    }
}
