package tr.com.martianrobots;

import tr.com.martianrobots.command.Command;
import tr.com.martianrobots.command.creator.CommandCreator;

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
        String s = "LRLRFFLR";
        char[] commandListCharArray = s.toCharArray();
        List<Command> commandList = new ArrayList<>();
        for(char c : commandListCharArray) {
            commandList.add(Constants.commandCreatorDictionary.get(Character.toString(c)).createCommand());
        }
        System.out.println(s);
    }
}
