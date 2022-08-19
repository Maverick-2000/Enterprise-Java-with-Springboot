
/*Print repeating characters */
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputString = scn.nextLine();
        scn.close();
        inputString = inputString.toLowerCase().replaceAll(" ", "");
        char[] inputArr = inputString.toCharArray();
        boolean visited[] = new boolean[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i] == inputArr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1)
                System.out.println(inputArr[i] + " occurs " + count + " times.");
        }
    }
}
