package Players.Warriors.Weapons;

import Enemies.Enemy;

public class WarAxe implements IWeapon {

    public void attack(Enemy enemy) {
        enemy.takeDamage(200);
    }

}
