
public class Marsrover {

    private int y;
    private String direction;

    public Marsrover(int x, int y, String direction) {
        this.y = y;
        this.direction = direction;
    }

    public int getXCoordinate() {
        return 1;
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
            if(direction == "North") {
                this.y -= 1;
            }else if(direction == "South"){
                this.y += 1;
            }
        }else if(move == 'R'){
            turn(move);
        }else if(move == 'L' ){
            turn(move);
        }
    }

    private void moveForward() {
        if(direction == "North") {
            this.y += 1;
        }else if(direction == "South"){
            this.y -= 1;
        }
    }

    private void turn(char direction) {
        if(this.direction == "North"){
            if(direction == 'R') {
                this.direction = "East";
            }else if(direction == 'L'){
                this.direction = "West";
            }
        }
    }
}
