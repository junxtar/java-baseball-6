package baseball.domain;

import baseball.constant.GameMessage;

public class Result {

    private final int strike;
    private final int ball;

    public Result(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public boolean isWin() {
        return strike == 3;
    }

    public String toMessage() {
        if (strike == 0 && ball == 0) {
            return GameMessage.NOTHING;
        }

        StringBuilder sb = new StringBuilder();
        if (ball > 0) {
            sb.append(ball).append(GameMessage.BALL).append(GameMessage.SPACE);
        }
        if (strike > 0) {
            sb.append(strike).append(GameMessage.STRIKE);
        }

        return sb.toString().trim();
    }
}
