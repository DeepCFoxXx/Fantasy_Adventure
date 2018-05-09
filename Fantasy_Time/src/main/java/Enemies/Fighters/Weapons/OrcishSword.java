package Enemies.Fighters.Weapons;

import Players.Player;

public class OrcishSword implements IWeaponEnemy{

    public void attack(Player player) {
        player.takeDamage(125);
    }
}
