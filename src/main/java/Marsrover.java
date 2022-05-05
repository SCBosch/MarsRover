import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

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

    public void move(String move) {
        char[] instructions = move.toCharArray();
        for (char instruction : instructions) {
            processInstruction(String.valueOf(instruction));
        }
    }

    private void processInstruction(String move) {
        if (Objects.equals(move, "F")) {
            moveForward();
        }else if("B".equals(move)) {
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

    private void turn(String direction) {
        if(direction.equals("R")) {
            int originalIndex = this.directions.indexOf(this.direction);
            int newDirectionIndex = originalIndex == 3 ? 0 : originalIndex + 1;
            this.direction =  this.directions.get(newDirectionIndex);
        }else if(direction.equals("L")){
            int originalIndex = this.directions.indexOf(this.direction);
            int newDirectionIndex = originalIndex == 0 ? 3 : originalIndex - 1;
            this.direction =  this.directions.get(newDirectionIndex);
        }
    }
}
