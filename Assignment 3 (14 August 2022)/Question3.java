
/*Check whether Anagrams */
import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        boolean isAnagram = true;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String inputString1 = scn.nextLine();
        System.out.println("Enter String 2: ");
        String inputString2 = scn.nextLine();
        scn.close();
        char[] strArr1 = inputString1.toLowerCase().toCharArray();
        char[] strArr2 = inputString2.toLowerCase().toCharArray();
        if (strArr1.length != strArr2.length)
            System.out.println("Not Anagrams.");
        else {
            Arrays.sort(strArr1);
            Arrays.sort(strArr2);

            for (int i = 0; i < strArr1.length; i++) {
                if (strArr1[i] != strArr2[i]) {
                    isAnagram = false;
                    break;
                }
            }
            if (isAnagram)
                System.out.println("They are Anagrams.");
            else
                System.out.println("Not Anagrams.");
        }
    }
}
