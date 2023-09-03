package programming.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task06 {
    static List<List<Integer>> ghosts = new ArrayList<>();
    // Каждый элемент списка - призрак. 0 индекс призрака - текущая банда, 1 индекс - в скольких бандах побывал

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] ghostsAndQuestions = inputLine.split(" ");
        int ghostsAmount = Integer.valueOf(ghostsAndQuestions[0]);
        int questionsAmount = Integer.valueOf(ghostsAndQuestions[1]);

        ghosts.add(new ArrayList<>());
            for (int i = 1; i <= ghostsAmount; i++) {
            ghosts.add(new ArrayList<>(Arrays.asList(i, 1)));
        }

        List<String> quesions = new ArrayList<>();
        for (int questionN = 0; questionN < questionsAmount; questionN++) {
            String currentQuestionLine = scanner.nextLine();
            quesions.add(currentQuestionLine);
        }

        for (String currentQuestion : quesions) {
            String[] currentQuestionData = currentQuestion.split(" ");
            String questionType = currentQuestionData[0];

            switch (questionType) {
                case "1" -> ghostsJoining(currentQuestionData);
                case "2" -> isGhostsInTheSameBand(currentQuestionData);
                case "3" -> howManyBandsWasVisited(currentQuestionData);
            }
        }
    }

    private static void ghostsJoining(String[] currentQuestion) {
        int ghostX = Integer.parseInt(currentQuestion[1]);
        int ghostY = Integer.parseInt(currentQuestion[2]);
        int ghostXCurrentBand = ghosts.get(ghostX).get(0);
        int ghostYCurrentBand = ghosts.get(ghostY).get(0);

        if(ghostXCurrentBand != ghostYCurrentBand) {

            for(List<Integer> currentGhost : ghosts) {
                if (!currentGhost.isEmpty()) {
                    if (currentGhost.get(0) == ghostYCurrentBand) {
                        currentGhost.set(0, ghostX);
                    }
                }
            }

            for(List<Integer> currentGhost : ghosts) {
                if (!currentGhost.isEmpty()) {
                    if (currentGhost.get(0) == ghostXCurrentBand) {
                        int currentAmountOfBandsVisited = currentGhost.get(1);
                        currentGhost.set(1, ++currentAmountOfBandsVisited);
                    }
                }
            }
        }
    }

    private static void isGhostsInTheSameBand(String[] currentQuestion) {
        int ghostX = Integer.parseInt(currentQuestion[1]);
        int ghostY = Integer.parseInt(currentQuestion[2]);
        if(ghosts.get(ghostX).get(0) == ghosts.get(ghostY).get(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void howManyBandsWasVisited(String[] currentQuestion) {
        int ghostX = Integer.parseInt(currentQuestion[1]);
        System.out.println(ghosts.get(ghostX).get(1));
    }
}
