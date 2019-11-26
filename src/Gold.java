public class Gold {
    int weight;
    int x;
    int y;
    Coordinate LocCurrent;

    public Gold(int weight, Coordinate locCurrent) {
        this.weight = weight;
        LocCurrent = locCurrent;
    }

    public Gold(int weight, int x, int y) {
        this.weight = weight;
        this.x = x;
        this.y = y;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Coordinate getLocCurrent() {
        return LocCurrent;
    }

    public void setLocCurrent(Coordinate locCurrent) {
        LocCurrent = locCurrent;
    }
}
