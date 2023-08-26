package programming;

import java.util.Scanner;

/**
 * заполнить матрицу диагоналями слав сверху вниз вправо
 * 124
 * 357
 * 689
 */

public class Task3 {
    public static void main(String[] args) {
        Integer result;
        String inputLine = new Scanner(System.in).nextLine();

        String[] dimensions = inputLine.split(" ");

        int n = Integer.parseInt(dimensions[0]);
        int m = Integer.parseInt(dimensions[1]);

        for (int i = 1; i <= n; i++) {
            int row = i;
            for(int column = 1; column <= m; column++) {
                System.out.print(column + "" + row);
                row--;
                if(column == i) break;
            }

            System.out.println();
        }

    }
}
