import java.util.HashMap;

public class Marsrover {

    private int y;
    private int x;
    private String direction;

    HashMap<String, Coordinate> moveMap  = new HashMap<String, Coordinate>() {{
        put("North", new Coordinate(0, 1));
        put("East", new Coordinate(1, 0));
        put("South", new Coordinate(0, -1));
        put("West", new Coordinate(-1, 0));
    }};

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
        if(this.direction == "North"){
            if(direction == 'R') {
                this.direction = "East";
            }
            else if(direction == 'L'){
                this.direction = "West";
            }
        }
    }
}
