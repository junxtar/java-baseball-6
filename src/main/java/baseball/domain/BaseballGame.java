package baseball.domain;

import baseball.ui.Narrator;

import java.util.Scanner;

public class BaseballGame {

    private final Narrator narrator = new Narrator();
    private final Scanner scanner = new Scanner(System.in);

    public void play() {
        do {
            Computer computer = Computer.createRandomBall();
            narrator.startGame();

            while (!isGameFinished()) {
                narrator.promptInput();
                String userInput = getUserInput();
                Player player = new Player(userInput);
                Result result = compare(computer, player);
                narrator.showResult(result);

                if (result.isWin()) {
                    narrator.announceWin();
                    break;
                }
            }
        } while (askRetry());
    }

    private boolean isGameFinished() {
        return false;
    }

    private String getUserInput() {
        return scanner.nextLine();
    }

    private Result compare(Computer computer, Player player) {
        return computer.compareWith(player);
    }

    private boolean askRetry() {
        narrator.askRetry();
        String retryInput = scanner.nextLine();
        return retryInput.equals("1");
    }
}

