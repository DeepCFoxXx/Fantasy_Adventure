package Rooms;

import Players.Party;

public class Room {

    private Exit direction;
//    private Party members;


    public Room(Exit direction) {
        this.direction = direction;
    }

    public Exit getDirection() {
        return this.direction;
    }

}
