
/*Print reverse of a string */
import java.util.Scanner;

public class Question1 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter String: ");
    String inputString = scn.nextLine();
    scn.close();
    for (int i = inputString.length() - 1; i >= 0; i--) {
      System.out.print(inputString.charAt(i));
    }

  }
}