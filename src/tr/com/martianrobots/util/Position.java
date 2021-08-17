package tr.com.martianrobots.util;

import tr.com.martianrobots.enums.Direction;

import java.util.Objects;

public class Position {

    private int x, y;
    private Direction direction;

    public Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Position(Position p) {
        this.x = p.getX();
        this.y = p.getY();
        this.direction = p.getDirection();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y && direction == position.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, direction);
    }
}
