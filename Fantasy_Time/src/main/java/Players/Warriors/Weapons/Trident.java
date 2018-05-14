package Players.Warriors.Weapons;

import Enemies.Enemy;

public class Trident implements IWeapon {

    public void attack(Enemy enemy) {
        enemy.takeDamage(140);
        enemy.takePhysicalStatDamage(30);
    }
}
