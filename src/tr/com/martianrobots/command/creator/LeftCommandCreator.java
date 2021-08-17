package tr.com.martianrobots.command.creator;

import tr.com.martianrobots.command.Command;
import tr.com.martianrobots.command.Left;

public class LeftCommandCreator implements CommandCreator {
    @Override
    public Command createCommand() {
        return new Left();
    }
}
