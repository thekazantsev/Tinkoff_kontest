package programming.qa;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        String word = "sheriff";
        int matchedLetters = 0;
        int repeatsAmount ;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuffer inputLine = new StringBuffer(input);

        boolean onceAgain = true;

        while (onceAgain) {
            for (char letter : word.toCharArray()) {
                int index = inputLine.indexOf(String.valueOf(letter));
                if (index != -1) {
                    matchedLetters++;
                    inputLine.deleteCharAt(index);
                } else {
                    onceAgain = false;
                    break;
                }
            }
        }

        repeatsAmount = matchedLetters / word.length();

        System.out.println(repeatsAmount);
    }
}
