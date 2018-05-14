package Players.Warriors.Weapons;

import Enemies.Enemy;

public class GreatSword implements IWeapon {

    public void attack(Enemy enemy) {
        enemy.takeDamage(180);
        enemy.takePhysicalStatDamage(40);
    }

}
