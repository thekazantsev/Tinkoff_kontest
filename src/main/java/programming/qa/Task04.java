package programming.qa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine1 = scanner.nextLine();
        String[] sumAndNotesVariety = inputLine1.split(" ");

        String inputLine2 = scanner.nextLine();
        inputLine2 = inputLine2 + " " + inputLine2;
        String[] numbers = inputLine2.split(" ");

        int targetSum = Integer.valueOf(sumAndNotesVariety[0]);

        List<Integer> usedNotes = new ArrayList<>();
        boolean canSum = canSum(numbers, targetSum, 0, usedNotes);

        if (canSum) {
            System.out.println(usedNotes.size());

            StringBuilder result = new StringBuilder();
            for (int note : usedNotes) {
                result.append(note).append(" ");
            }
            System.out.println(result.toString().trim());
        } else {
            System.out.println(-1);
        }
    }

    private static boolean canSum(String[] numbers, int targetSum, int currentIndex, List<Integer> usedNumbers) {
        if (targetSum == 0) {
            return true;
        }
        if (currentIndex >= numbers.length) {
            return false;
        }

        int currentNumber = Integer.parseInt(numbers[currentIndex]);
        if (currentNumber <= targetSum) {
            usedNumbers.add(currentNumber);
            boolean canSumWithCurrent = canSum(numbers, targetSum - currentNumber, currentIndex + 1, usedNumbers);
            if (canSumWithCurrent) {
                return true;
            }
            usedNumbers.remove(usedNumbers.size() - 1);
        }

        return canSum(numbers, targetSum, currentIndex + 1, usedNumbers);
    }
}
