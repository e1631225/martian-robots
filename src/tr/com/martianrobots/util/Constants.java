package tr.com.martianrobots.util;

import tr.com.martianrobots.command.creator.CommandCreator;
import tr.com.martianrobots.command.creator.ForwardCommandCreator;
import tr.com.martianrobots.command.creator.LeftCommandCreator;
import tr.com.martianrobots.command.creator.RightCommandCreator;
import tr.com.martianrobots.enums.Direction;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static Map<String, CommandCreator> commandCreatorDictionary = new HashMap<>();
    public static Map<String, Direction> directionMap = new HashMap<>();
    static {
        commandCreatorDictionary.put("R", new RightCommandCreator());
        commandCreatorDictionary.put("L", new LeftCommandCreator());
        commandCreatorDictionary.put("F", new ForwardCommandCreator());

        directionMap.put("N", Direction.NORTH);
        directionMap.put("E", Direction.EAST);
        directionMap.put("W", Direction.WEST);
        directionMap.put("S", Direction.SOUTH);
    }

    public static final int MAX_COORDINATE_VALUE = 50;
    public static final int MAX_INSTRUCTION_STRING_LENGTH = 100;
    public static final String LOST = "LOST";

    public static final int LOWER_X_BOUND = 0;
    public static final int LOWER_Y_BOUND = 0;
    public static int UPPER_X_BOUND = 5;
    public static int UPPER_Y_BOUND = 5;


}
