public class Hole {
    boolean wall;
    boolean floor;
    int x;
    int y;

    public Hole(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Hole(boolean wall, boolean floor, int x, int y) {
        this.wall = wall;
        this.floor = floor;
        this.x = x;
        this.y = y;
    }

    public boolean isWall() {
        return wall;
    }

    public void setWall(boolean wall) {
        this.wall = wall;
    }

    public boolean isFloor() {
        return floor;
    }

    public void setFloor(boolean floor) {
        this.floor = floor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
