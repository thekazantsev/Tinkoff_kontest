import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parts = scanner.nextInt();
        int cuts = 0;

        if (parts > 1) cuts = getCuts(parts, cuts);

        System.out.println(cuts);
    }

    private static int getCuts(int parts, int cuts) {
        if (parts % 2 != 0) parts++;

        while (parts % 2 != 1) {
            if (parts % 2 == 0) {
                parts = parts / 2;
                cuts++;
            }

            if (parts % 3 == 0) {
                parts = parts / 3;
                cuts= cuts + 2;
            }

        }
        return cuts;
    }
}
