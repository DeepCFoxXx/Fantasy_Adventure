package Enemies.Boss_Enemies.Boss_Weapons;

import Players.Player;

public class DeathScythe implements IBossWeapon {

    public void attack(Player player) {
        player.takeDamage(400);
        player.takeStrengthDamage(30);
        player.takeMagicDamage(30);
        player.takeDefenceDamage(30);
        player.takeVitalityDamage(30);
        player.takeLuckDamage(20);
        player.getsPoisoned();
    }

}
