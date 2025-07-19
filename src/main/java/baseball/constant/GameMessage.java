package baseball.constant;

public final class GameMessage {

    // 게임 흐름
    public static final String START_GAME = "숫자 야구 게임을 시작합니다.";
    public static final String INPUT_PROMPT = "숫자를 입력해 주세요: ";
    public static final String WIN_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료.";
    public static final String RETRY_PROMPT = "게임을 다시 시작하시겠습니까? (1: 재시작, 2: 종료)";

    // 결과 메시지
    public static final String NOTHING = "낫싱";
    public static final String STRIKE = "스트라이크";
    public static final String BALL = "볼";

    // 예외 메시지
    public static final String INVALID_INPUT_LENGTH = "세 자리 숫자를 입력해야 합니다.";
    public static final String INVALID_INPUT_DUPLICATE = "중복되지 않는 숫자를 입력해야 합니다.";
    public static final String INVALID_INPUT_NON_DIGIT = "숫자만 입력해야 합니다.";


    // util
    public static final String SPACE = " ";
    private GameMessage() {
    }
}


