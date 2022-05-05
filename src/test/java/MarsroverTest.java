import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsroverTest {

    @Test
    void roverCanMoveForwardNorth() {
        int initialCoordinate = 1;
        Marsrover rover = new Marsrover(initialCoordinate, initialCoordinate, "N");
        rover.move("F");
        assertEquals(initialCoordinate+1, rover.getYCoordinate());
        assertEquals(initialCoordinate, rover.getXCoordinate());
        assertEquals("N", rover.getDirection());
    }

    @Test
    void roverCanMoveBackwardsNorth() {
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "N");

        rover.move("B");

        assertEquals(initialYCoordinate - 1, rover.getYCoordinate());
    }

    @Test
    void roverCanMoveForwardsSouth(){
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "S");

        rover.move("F");

        assertEquals(initialYCoordinate - 1, rover.getYCoordinate());
    }

    @Test
    void roverCanMoveForwardsEast(){
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "E");

        rover.move("F");

        assertEquals(initialXCoordinate + 1, rover.getXCoordinate());
    }

    @Test
    void roverCanMoveBackwardsEast() {
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "E");

        rover.move("B");

        assertEquals(initialXCoordinate - 1, rover.getXCoordinate());
    }

    @Test
    void roverCanMoveForwardsWest() {
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "W");

        rover.move("F");

        assertEquals(initialXCoordinate - 1, rover.getXCoordinate());
    }

    @Test
    void roverCanMoveBackwardsWest(){
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "W");

        rover.move("B");

        assertEquals(initialXCoordinate + 1, rover.getXCoordinate());
    }

    @Test
    void roverCanMoveBackwardsSouth(){
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "S");

        rover.move("B");

        assertEquals(initialYCoordinate + 1, rover.getYCoordinate());
    }

    @Test
    void roverCanTurnRightFromNorth(){
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "N");
        rover.move("R");

        assertEquals("E", rover.getDirection());
    }

    @Test
    void roverCanTurnLeftFromNorth(){
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "N");
        rover.move("L");

        assertEquals("W", rover.getDirection());
    }

    @Test
    void roverCanTurnRightFromEast(){
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "E");
        rover.move("R");
        assertEquals("S", rover.getDirection());
    }

    @Test
    void roverCanProcessSequenceOfTwoInstructions(){
        int initialXCoordinate = 5;
        int initialYCoordinate = 5;
        Marsrover rover = new Marsrover(initialXCoordinate, initialYCoordinate, "N");
        rover.move("RR");
        assertEquals("S", rover.getDirection());
    }

}
