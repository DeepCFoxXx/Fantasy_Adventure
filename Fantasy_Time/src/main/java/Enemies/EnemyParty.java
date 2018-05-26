package Enemies;

import java.util.ArrayList;

public class EnemyParty {

    ArrayList<Enemy>enemies;

    public EnemyParty() {
        this.enemies = new ArrayList<>();
    }

    public int getEnemyCount() {
        return this.enemies.size();
    }

}
