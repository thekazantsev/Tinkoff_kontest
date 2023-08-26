package programming;

/**
 * заполнить матрицу диагоналями слав сверху вниз вправо
 * 124
 * 357
 * 689
 *
 * 11
 * 12	21
 * 13	22	31
 * 23	32
 * 33
 *
 * пытаюсь решить так: генерирую адреса ячеек в двухмерном списке для последовательно заполнения
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Integer result;
        String inputLine = new Scanner(System.in).nextLine();

        String[] dimensions = inputLine.split(" ");

        int c = Integer.parseInt(dimensions[0]);
        int r = Integer.parseInt(dimensions[1]);

        int[][] finalArray = new int[r][c];
        int counter = 1;
        int marker = 1;

        for (int i = 1; i <= c*2-1; i++) {
            int secondDigit = i;

            if (i >= c+1) {
                marker++;
                secondDigit = c;
            }

            for(int firstDigit = marker; firstDigit <= r; firstDigit++) {
                finalArray[firstDigit-1][secondDigit-1] = counter++;
                secondDigit--;
                if(firstDigit == i) break;
            }
        }

        for (int i = 0; i < finalArray.length; i++) {
            for (int j = 0; j < finalArray[i].length; j++) {
                System.out.print(finalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
