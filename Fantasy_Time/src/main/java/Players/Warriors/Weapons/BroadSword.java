package Players.Warriors.Weapons;

import Enemies.Enemy;

public class BroadSword implements IWeapon {

    public void attack(Enemy enemy) {
        enemy.takeDamage(125);
    }
}
