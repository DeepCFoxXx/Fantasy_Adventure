package Enemies.Fighters.Weapons;

import Players.Player;

public class BloodDagger implements IWeaponEnemy{

    public void attack(Player player) {
        player.takeDamage(100);
        player.takeDefenceDamage(5);
    }

}
