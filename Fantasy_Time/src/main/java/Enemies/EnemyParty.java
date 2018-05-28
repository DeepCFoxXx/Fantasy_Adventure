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

    public void removeEnemy(Enemy enemy) {
        this.enemies.remove(enemy);
    }

    public void clearParty() {
        this.enemies.clear();
    }

    public int getTotalHealth() {

        int total = 0;

        for (Enemy health : enemies) {
            total += health.getHealthValue();
        }
        return total;
    }

}
