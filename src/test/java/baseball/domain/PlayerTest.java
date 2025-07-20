package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import baseball.constant.GameMessage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Player 입력값 유효성 검증")
class PlayerTest {

    @Test
    void 세자리숫자가_아니면_예외발생() {
        assertThatThrownBy(() -> new Player("12"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(GameMessage.INVALID_INPUT_LENGTH);
    }

    @Test
    void 숫자가_아닌값이_포함되면_예외발생() {
        assertThatThrownBy(() -> new Player("1a3"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(GameMessage.INVALID_INPUT_NON_DIGIT);
    }

    @Test
    void 중복된_숫자가_있으면_예외발생() {
        assertThatThrownBy(() -> new Player("112"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(GameMessage.INVALID_INPUT_DUPLICATE);
    }

    @Test
    void 올바른_입력이면_객체_생성됨() {
        assertThatCode(() -> new Player("123"))
            .doesNotThrowAnyException();
    }
}
