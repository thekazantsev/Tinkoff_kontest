package programming;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        int result = 1;

        if (minutes > 1) result = (minutes - 1) * 4;

        System.out.println(result);
    }
}
