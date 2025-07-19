package baseball.ui;

import baseball.constant.GameMessage;
import baseball.domain.Result;

public class Narrator {

    public void say(String message) {
        System.out.println(message);
    }

    public void startGame() {
        say(GameMessage.START_GAME);
    }

    public void promptInput() {
        say(GameMessage.INPUT_PROMPT);
    }

    public void announceWin() {
        say(GameMessage.WIN_MESSAGE);
    }

    public void askRetry() {
        say(GameMessage.RETRY_PROMPT);
    }

    public void showResult(Result result) {
        say(result.toMessage());
    }
}
