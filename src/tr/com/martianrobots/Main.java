package tr.com.martianrobots;

import tr.com.martianrobots.command.Command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tr.com.martianrobots.util.Constants;
import tr.com.martianrobots.util.Pair;

public class Main {

    private static List<Pair<Position, Command>> scentList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);

        String[] mapBorderStringArray = s.split(" ");
        Constants.UPPER_X_BOUND = Integer.parseInt(mapBorderStringArray[0]);
        Constants.UPPER_Y_BOUND = Integer.parseInt(mapBorderStringArray[1]);

        System.out.println("x: " + Constants.UPPER_X_BOUND + " y: " + Constants.UPPER_Y_BOUND);

        while (!(s = scanner.nextLine()).trim().equals("")) {
            boolean isLost = false;
            String[] initialPositionStringArray = s.split(" ");
            Position position = new Position(Integer.parseInt(initialPositionStringArray[0]),
                    Integer.parseInt(initialPositionStringArray[1]),
                    Constants.directionMap.get(initialPositionStringArray[2]));

            s = scanner.nextLine();
            char[] commandListCharArray = s.toCharArray();
            List<Command> commandList = new ArrayList<>();
            for (char c : commandListCharArray) {
                commandList.add(Constants.commandCreatorDictionary.get(Character.toString(c)).createCommand());
            }

            for (Command command : commandList) {
                if (checkCommandIsInScentList(command, position)) {
                    continue;
                } else if (!checkRobotIsInBoundries(command, position)) {
                    scentList.add(new Pair<>(position, command));
                    isLost = true;
                    break;
                } else {
                    command.applyCommand(position);
                }
            }
            if (isLost) {
                System.out.println(position.getX() + " " + position.getY() + " " + position.getDirection().getCode() + " " + Constants.LOST);
            } else {
                System.out.println(position.getX() + " " + position.getY() + " " + position.getDirection().getCode());
            }
        }
    }

    private static boolean checkRobotIsInBoundries(Command command, Position position) {
        Position newPosition = new Position(position); // dummy position to check if the robot is still in boundries
        command.applyCommand(newPosition); //fake applycommand to check if next command would cause any problem.
        return Constants.UPPER_X_BOUND >= newPosition.getX() &&
                Constants.UPPER_Y_BOUND >= newPosition.getY() &&
                Constants.LOWER_X_BOUND <= newPosition.getX() &&
                Constants.LOWER_Y_BOUND <= newPosition.getY();

    }

    private static boolean checkCommandIsInScentList(Command command, Position position) {
        for (Pair<Position, Command> pair : scentList) {
            if (pair.getLeft().equals(position) && pair.getRight().getClass().equals(command.getClass())) {
                return true;
            }
        }
        return false;
    }
}
