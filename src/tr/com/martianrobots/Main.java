package tr.com.martianrobots;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s);

        String[] mapBorderStringArray = s.split(" ");
        int boundX = Integer.parseInt(mapBorderStringArray[0]);
        int boundY = Integer.parseInt(mapBorderStringArray[1]);

        System.out.println("x: " + boundX + " y: " + boundY);

        s = br.readLine();
        String[] initialPositionStringArray = s.split(" ");
        System.out.println(s);

        s = br.readLine();
        char[] commandList = s.toCharArray();
        System.out.println(s);
    }
}
