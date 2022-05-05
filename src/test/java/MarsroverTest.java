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

    @Test
    void roverCanMoveBackwardsNorth() {
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "North");

        rover.move('B');

        assertEquals(initialYCoordinate - 1, rover.getYCoordinate());
    }

    @Test
    void roverCanMoveForwardsSouth(){
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "South");

        rover.move('F');

        assertEquals(initialYCoordinate - 1, rover.getYCoordinate());
    }

    @Test
    void roverCanMoveBackwardsSouth(){
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "South");

        rover.move('B');

        assertEquals(initialYCoordinate + 1, rover.getYCoordinate());
    }

    @Test
    void roverCanTurnRightFromNorth(){
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "North");
        rover.move('R');

        assertEquals("East", rover.getDirection());
    }

    @Test
    void roverCanTurnLeftFromNorth(){
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "North");
        rover.move('L');

        assertEquals("West", rover.getDirection());
    }


}
