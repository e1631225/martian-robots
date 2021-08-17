package tr.com.martianrobots.command.creator;

import tr.com.martianrobots.command.Command;
import tr.com.martianrobots.command.ForwardCommand;

public class ForwardCommandCreator implements CommandCreator {
    @Override
    public Command createCommand() {
        return new ForwardCommand();
    }
}
