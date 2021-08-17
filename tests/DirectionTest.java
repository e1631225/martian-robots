import org.junit.Test;
import static org.junit.Assert.*;
import tr.com.martianrobots.Position;
import tr.com.martianrobots.command.LeftCommand;
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
}
