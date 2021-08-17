package tr.com.martianrobots.command;

import tr.com.martianrobots.Position;
import tr.com.martianrobots.enums.Direction;

public class RightCommand implements Command {
    @Override
    public void applyCommand(Position position) {
        switch (position.getDirection()) {
            case EAST -> position.setDirection(Direction.SOUTH);
            case NORTH -> position.setDirection(Direction.EAST);
            case WEST -> position.setDirection(Direction.NORTH);
            case SOUTH -> position.setDirection(Direction.WEST);
        }
    }
}
