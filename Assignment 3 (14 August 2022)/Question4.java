
/*Check whether Pangram */
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        boolean isPangram = true;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputString = scn.nextLine();
        scn.close();
        inputString = inputString.toLowerCase();
        if (inputString.length() < 26) {
            isPangram = false;
        } else {
            String letters = "abcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < letters.length(); i++) {
                if (inputString.indexOf(letters.charAt(i)) == -1) {
                    isPangram = false;
                    break;
                }
            }
        }
        if (isPangram)
            System.out.println("It is a Pangram.");
        else
            System.out.println("Not a Pangram.");
    }
}
