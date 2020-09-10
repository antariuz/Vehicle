package best.com;

public class Door {

    private Side side;

    public Door(Side doorSide) {
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public enum Side {
        LEFT_FRONT_DOOR, RIGHT_FRONT_DOOR,
        LEFT_REAR_DOOR, RIGHT_REAR_DOOR;
    }

}
