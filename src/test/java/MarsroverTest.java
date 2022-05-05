import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsroverTest {

    @Test
    void roverCanMoveForwardNorth() {
        int initialCoordinate = 1;
        Marsrover rover = new Marsrover(initialCoordinate, initialCoordinate, "North");
        rover.move('F');
        assertEquals(initialCoordinate+1, rover.getYCoordinate());
        assertEquals(initialCoordinate, rover.getXCoordinate());
        assertEquals("North", rover.getDirection());
    }
}
