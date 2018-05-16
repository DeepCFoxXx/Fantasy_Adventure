package Enemies.Fighters.Weapons;

import Players.Player;

public class BattleAxe implements IWeaponEnemy{

    public void attack(Player player) {
        player.takeDamage(180);
        player.takeDefenceDamage(5);
    }

}
