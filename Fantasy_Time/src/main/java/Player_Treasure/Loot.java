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

    public void addTreasure(ITreasure loot) {
        this.loot.add(loot);
    }

    public void removeTreasure(ITreasure loot) {
        this.loot.remove(loot);
    }

    public void clearLoot() {
        this.loot.clear();
    }

    public int getTotalLoot() {

        int total = 0;

        for (ITreasure treasure : loot) {
            total += treasure.getValue();
        }
        return total;

    }
}
