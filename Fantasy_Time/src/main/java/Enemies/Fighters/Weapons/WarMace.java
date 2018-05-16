package Enemies.Fighters.Weapons;

import Players.Player;

public class WarMace implements IWeaponEnemy{

    public void attack(Player player) {
        player.takeDamage(130);
        player.takeDefenceDamage(5);
    }

}
