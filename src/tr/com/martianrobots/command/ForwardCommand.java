package tr.com.martianrobots.command;

import tr.com.martianrobots.util.Position;

public class ForwardCommand implements Command {
    @Override
    public void applyCommand(Position position) {
        switch (position.getDirection()) {
            case EAST -> position.setX(position.getX() + 1);
            case NORTH -> position.setY(position.getY() + 1);
            case WEST -> position.setX(position.getX() - 1);
            case SOUTH -> position.setY(position.getY() - 1);
        }
    }
}
