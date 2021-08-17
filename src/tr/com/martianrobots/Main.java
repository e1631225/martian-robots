package tr.com.martianrobots;

import tr.com.martianrobots.command.Command;
import tr.com.martianrobots.enums.Direction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        System.out.println(s);
//
//        String[] mapBorderStringArray = s.split(" ");
//        int boundX = Integer.parseInt(mapBorderStringArray[0]);
//        int boundY = Integer.parseInt(mapBorderStringArray[1]);
//
//        System.out.println("x: " + boundX + " y: " + boundY);
//
//        s = br.readLine();
//        String[] initialPositionStringArray = s.split(" ");
//        System.out.println(s);
//
//        s = br.readLine();
        String s = "FFFFFFFFF";
        char[] commandListCharArray = s.toCharArray();
        List<Command> commandList = new ArrayList<>();
        for(char c : commandListCharArray) {
            commandList.add(Constants.commandCreatorDictionary.get(Character.toString(c)).createCommand());
        }
        Position position = new Position(0, 0, Direction.NORTH);
        for (Command command : commandList) {
            if (!checkRobotIsInBoundries(command, position)) {
                break;
            }
            command.applyCommand(position);
            System.out.println(position.getX() + " " + position.getY() + " " + position.getDirection().getCode());
        }
        System.out.println(position.getX() + " " + position.getY() + " " + position.getDirection().getCode());
    }

    /***
     * Check if the applyCommand would cause to robot goes beyond borders
     * @param command
     * @param position
     * @return
     */
    private static boolean checkRobotIsInBoundries(Command command, Position position) {
        Position newPosition = new Position(position); // dummy position to check if the robot is still in boundries
        command.applyCommand(newPosition); //fake applycommand to check if next command would cause any problem.
        return Constants.UPPER_X_BOUND >= newPosition.getX() &&
                Constants.UPPER_Y_BOUND >= newPosition.getY() &&
                Constants.LOWER_X_BOUND <= newPosition.getX() &&
                Constants.LOWER_Y_BOUND <= newPosition.getY();

    }
}
