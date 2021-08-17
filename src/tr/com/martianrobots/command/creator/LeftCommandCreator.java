package tr.com.martianrobots.command.creator;

import tr.com.martianrobots.command.Command;
import tr.com.martianrobots.command.LeftCommand;

public class LeftCommandCreator implements CommandCreator {
    @Override
    public Command createCommand() {
        return new LeftCommand();
    }
}
