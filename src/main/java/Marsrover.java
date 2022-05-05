import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Marsrover {

    private int y;
    private int x;
    private String direction;

    HashMap<String, Coordinate> moveMap  = new HashMap<String, Coordinate>() {{
        put("N", new Coordinate(0, 1));
        put("E", new Coordinate(1, 0));
        put("S", new Coordinate(0, -1));
        put("W", new Coordinate(-1, 0));
    }};

    List<String> directions = Arrays.asList("N", "E", "S", "W");

    public Marsrover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getXCoordinate() {
        return this.x;
    }

    public int getYCoordinate() {
        return this.y;
    }

    public String getDirection() {
        return this.direction;
    }

    public void move(char move) {
        if (move == 'F') {
            moveForward();
        }else if(move == 'B') {
            moveBackwards();
        }
        turn(move);
    }

    private void moveBackwards() {
        Coordinate changeCoordinate = moveMap.get(direction);
        this.x += -changeCoordinate.x;
        this.y += -changeCoordinate.y;
    }

    private void moveForward() {
        Coordinate changeCoordinate = moveMap.get(direction);
        this.x += changeCoordinate.x;
        this.y += changeCoordinate.y;
    }

    private void turn(char direction) {
        if(this.direction == "N"){
            if(direction == 'R') {
                this.direction = "E";
            }
            else if(direction == 'L'){
                this.direction = "W";
            }
        }
    }
}
