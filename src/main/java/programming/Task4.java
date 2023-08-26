package programming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * проверка что 4 входящих квадрата могут образовать большой квадрат
 * 3 3 3 3 - да
 * 2 3 3 4 - нет
 *
 *
 */

public class Task4 {
    public static void main(String[] args) {

        String[] floorsStrings = new Scanner(System.in).nextLine().split(" ");
        int[] squares = Arrays.stream(floorsStrings).mapToInt(Integer::parseInt).toArray();
        String result = "YES";

        for (int i = 1; i < squares.length; i++) {
            if (squares[i] != squares[i-1]) result = "NO";
        }

        System.out.println(result);
    }
}
