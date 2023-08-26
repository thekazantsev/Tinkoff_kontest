package programming;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String inputLine = new Scanner(System.in).nextLine();
        String clearedString = inputLine.replaceAll("^0+|0+$", "");

        char symbolToCount = '0';

        long count = clearedString.chars()
            .mapToObj(c -> (char) c)
            .filter(c -> c == symbolToCount)
            .count();

        System.out.println(count);
    }
}