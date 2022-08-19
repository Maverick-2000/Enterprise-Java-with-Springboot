
/*Sort string alphabetically */
import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputString = scn.nextLine();
        scn.close();
        char[] inputArr = inputString.toCharArray();
        Arrays.sort(inputArr);
        System.out.println(new String(inputArr));
    }
}
