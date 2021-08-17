package tr.com.martianrobots.command;

import tr.com.martianrobots.Position;

public interface Command {
    public void applyCommand(Position position);
}
