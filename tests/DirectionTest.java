import org.junit.Test;
import static org.junit.Assert.*;
import tr.com.martianrobots.Position;
import tr.com.martianrobots.command.ForwardCommand;
import tr.com.martianrobots.command.LeftCommand;
import tr.com.martianrobots.command.RightCommand;
import tr.com.martianrobots.enums.Direction;

public class DirectionTest {

    @Test
    public void turnLeft() {
        Position position = new Position(0, 0, Direction.EAST);
        LeftCommand leftCommand = new LeftCommand();
        leftCommand.applyCommand(position);
        assertEquals(Direction.NORTH, position.getDirection());

        leftCommand.applyCommand(position);
        assertEquals(Direction.WEST, position.getDirection());

        leftCommand.applyCommand(position);
        assertEquals(Direction.SOUTH, position.getDirection());

        leftCommand.applyCommand(position);
        assertEquals(Direction.EAST, position.getDirection());
    }

    @Test
    public void turnRight() {
        Position position = new Position(0, 0, Direction.EAST);
        RightCommand rightCommand = new RightCommand();
        rightCommand.applyCommand(position);
        assertEquals(Direction.SOUTH, position.getDirection());

        rightCommand.applyCommand(position);
        assertEquals(Direction.WEST, position.getDirection());

        rightCommand.applyCommand(position);
        assertEquals(Direction.NORTH, position.getDirection());

        rightCommand.applyCommand(position);
        assertEquals(Direction.EAST, position.getDirection());
    }

    @Test
    public void forward() {
        Position position = new Position(0, 0, Direction.EAST);
        ForwardCommand forwardCommand = new ForwardCommand();
        forwardCommand.applyCommand(position);
        assertEquals(1, position.getX());

        forwardCommand.applyCommand(position);
        assertEquals(2, position.getX());

        forwardCommand.applyCommand(position);
        assertEquals(3, position.getX());

    }
}
