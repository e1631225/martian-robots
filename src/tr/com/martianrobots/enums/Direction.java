package tr.com.martianrobots.enums;

public enum Direction {

    NORTH("N"), EAST("E"), SOUTH("S"), WEST("S");

    private String code;

    Direction(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
