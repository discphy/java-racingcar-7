package racingcar.message;

public enum RacingMessage implements Message {

    CAR_NAME_POSITION("%s : %s"),
    FINAL_WINNERS("최종 우승자: %s")
    ;

    private final String message;

    RacingMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}