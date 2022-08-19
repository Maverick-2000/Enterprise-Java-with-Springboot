
/*Count vowels and consonants */
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        int numVowels = 0, numCons = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputString = scn.nextLine();
        scn.close();
        char[] inputArr = inputString.toLowerCase().toCharArray();
        for (int i = 0; i < inputArr.length; i++) {
            switch (inputArr[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    numVowels++;
                    break;
                default:
                    numCons++;
            }
        }
        System.out.println("The number of Vowels are: " + numVowels);
        System.out.println("The number of Consonants are: " + numCons);
    }
}
