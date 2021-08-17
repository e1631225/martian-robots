package tr.com.martianrobots;

import tr.com.martianrobots.command.creator.CommandCreator;
import tr.com.martianrobots.command.creator.ForwardCommandCreator;
import tr.com.martianrobots.command.creator.LeftCommandCreator;
import tr.com.martianrobots.command.creator.RightCommandCreator;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static Map<String, CommandCreator> commandCreatorDictionary = new HashMap<>();
    static {
        commandCreatorDictionary.put("R", new RightCommandCreator());
        commandCreatorDictionary.put("L", new LeftCommandCreator());
        commandCreatorDictionary.put("F", new ForwardCommandCreator());
    }

    public static final int MAX_COORDINATE_VALUE = 50;
    public static final int MAX_INSTRUCTION_STRING_LENGTH = 100;
    public static final String LOST = "LOST";


}
