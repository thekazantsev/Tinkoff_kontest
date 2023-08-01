import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Integer result = 0;
        String inputLine = new Scanner(System.in).nextLine();

        String[] numbersString = inputLine.split(" ");
        int[] numbers = new int[numbersString.length];

        for (int i = 0; i < numbersString.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }

        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];
        int d = numbers[3];

        if (b < d) {
            result = a + (d - b) * c;
        } else {
            result = a;
        }

        System.out.println(result);
    }
}
