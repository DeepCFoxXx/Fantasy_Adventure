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

    public void addEnemy(Enemy enemy) {
        this.enemies.add(enemy);
    }

}
