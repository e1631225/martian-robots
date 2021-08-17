package tr.com.martianrobots.command;

import tr.com.martianrobots.util.Position;

public interface Command {
    public void applyCommand(Position position);
}
