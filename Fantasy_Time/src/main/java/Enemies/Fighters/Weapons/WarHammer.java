package Enemies.Fighters.Weapons;

import Players.Player;

public class WarHammer implements IWeaponEnemy{

    public void attack(Player player) {
        player.takeDamage(200);
    }

}
