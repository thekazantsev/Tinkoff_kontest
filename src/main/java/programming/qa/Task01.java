package programming.qa;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int highestPrice = 0;
        Scanner scanner = new Scanner(System.in);

        int[] gunsAndMoney = Arrays.stream(scanner.nextLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

        int moneyInPocket = gunsAndMoney[1];

        int[] prices = Arrays.stream(scanner.nextLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

        for (int currentPrice : prices) {
            if (currentPrice <= moneyInPocket && currentPrice > highestPrice) {
                highestPrice = currentPrice;
            }
        }

        System.out.println(highestPrice);
    }
}
