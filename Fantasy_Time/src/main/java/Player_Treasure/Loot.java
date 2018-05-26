package Player_Treasure;

import java.util.ArrayList;

public class Loot {

    ArrayList<ITreasure>loot;

    public Loot() {
        this.loot = new ArrayList<>();
    }

    public int getLootCount() {
        return this.loot.size();
    }

}
