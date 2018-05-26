package Rooms;

public class Room {

    private Exit direction;

    public Room(Exit direction) {
        this.direction = direction;
    }

    public Exit getDirection() {
        return direction;
    }

}
