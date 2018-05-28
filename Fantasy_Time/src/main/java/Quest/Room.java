package Quest;

import Enemies.EnemyParty;
import Player_Treasure.Loot;
import Players.Party;

public class Room {

    private Exit direction;
    private Party members;
    private Loot treasure;
    private EnemyParty enemies;


    public Room(Exit direction, Party members, Loot treasure, EnemyParty enemies) {
        this.direction = direction;
        this.members = members;
        this.treasure = treasure;
        this.enemies = enemies;
    }

    public Exit getDirection() {
        return this.direction;
    }

}
