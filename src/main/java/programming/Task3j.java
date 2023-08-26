package programming;

/**
 * добавление удаление деталей с полки
 * первая цифра - количество действий
 * последующие цифра описывают действие и номер детали
 * + положили
 * - убрали
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3j {
    static List<Integer> actions = new ArrayList<>();
    static List<Integer> rack = new ArrayList<>();

    public static void main(String[] args) {
        int actionsAmount = new Scanner(System.in).nextInt();

        Integer action;
        Scanner scanner2 = new Scanner(System.in);
        for (int i = 0; i < actionsAmount; i++) {
            String input = scanner2.nextLine();
            String modifiedInput = input.replaceAll("\\s", "");
            action = Integer.parseInt(modifiedInput);

            if (action > 0) {
                addToRack(action);
            }

            if (action < 0) {
                removeFromRack(Math.abs(action));
            }
        }

        for (Integer rackNumber: actions) {
            System.out.println(rackNumber+1);
        }
    }

    private static void removeFromRack(Integer action) {
        int index = rack.indexOf(action);
        if (index != -1) {
            rack.set(index, 0);}
    }

    private static void addToRack(Integer action) {
        for (int i = 0; i < rack.size(); i++) {
            if (rack.get(i) == 0) {
                rack.set(i, action);
                actions.add(i);
                return;
            }
        }
        rack.add(action);
        actions.add(rack.indexOf(action));
    }
}
