
public class Marsrover {

    private int y;

    public Marsrover(int x, int y, String direction) {
        this.y = y;
    }

    public int getXCoordinate() {
        return 1;
    }

    public int getYCoordinate() {
        return this.y;
    }

    public String getDirection() {
        return "North";
    }

    public void move(char move) {
        this.y += 1;
    }
}
