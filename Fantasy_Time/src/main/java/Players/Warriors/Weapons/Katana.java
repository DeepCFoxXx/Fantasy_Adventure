package Players.Warriors.Weapons;

import Enemies.Enemy;

public class Katana implements IWeapon {

    public void attack(Enemy enemy) {
        enemy.takeDamage(210);
    }

}
