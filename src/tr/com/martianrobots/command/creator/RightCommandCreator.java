package tr.com.martianrobots.command.creator;

import tr.com.martianrobots.command.Command;
import tr.com.martianrobots.command.RightCommand;

public class RightCommandCreator implements CommandCreator {
    @Override
    public Command createCommand() {
        return new RightCommand();
    }
}
