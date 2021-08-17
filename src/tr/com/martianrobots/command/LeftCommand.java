package tr.com.martianrobots.command;

import tr.com.martianrobots.Position;
import tr.com.martianrobots.enums.Direction;

public class LeftCommand implements Command {

    @Override
    public void applyCommand(Position position) {
        switch (position.getDirection()) {
            case EAST -> position.setDirection(Direction.NORTH);
            case NORTH -> position.setDirection(Direction.WEST);
            case WEST -> position.setDirection(Direction.SOUTH);
            case SOUTH -> position.setDirection(Direction.EAST);
        }
    }
}
