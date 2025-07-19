package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer {

    private final List<Integer> balls;

    private Computer(List<Integer> balls) {
        this.balls = balls;
    }

    public static Computer createRandomBall() {
        List<Integer> randomBalls = new ArrayList<>();
        while (randomBalls.size() < 3) {
            int number = Randoms.pickNumberInRange(1, 9);
            if (!randomBalls.contains(number)) {
                randomBalls.add(number);
            }
        }
        return new Computer(randomBalls);
    }

    public Result compareWith(Player player) {
        int strike = 0;
        int ball = 0;
        List<Integer> userBalls = player.getBalls();

        for (int i = 0; i < 3; i++) {
            if (balls.get(i).equals(userBalls.get(i))) {
                strike++;
            } else if (balls.contains(userBalls.get(i))) {
                ball++;
            }
        }

        return new Result(strike, ball);
    }
}


