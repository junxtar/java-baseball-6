package baseball.domain;
import baseball.constant.GameMessage;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private final List<Integer> balls;

    public Player(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException(GameMessage.INVALID_INPUT_LENGTH);
        }

        if (!input.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException(GameMessage.INVALID_INPUT_NON_DIGIT);
        }

        balls = new ArrayList<>();
        for (char c : input.toCharArray()) {
            int number = Character.getNumericValue(c);
            if (balls.contains(number)) {
                throw new IllegalArgumentException(GameMessage.INVALID_INPUT_DUPLICATE);
            }
            balls.add(number);
        }
    }

    public List<Integer> getBalls() {
        return balls;
    }
}

