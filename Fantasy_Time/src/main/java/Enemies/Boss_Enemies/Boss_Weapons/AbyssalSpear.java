package Enemies.Boss_Enemies.Boss_Weapons;

import Players.Player;

public class AbyssalSpear implements IBossWeapon {

    public void attack(Player player) {
        player.takeDamage(300);
        player.takeStrengthDamage(20);
        player.takeMagicDamage(20);
        player.takeDefenceDamage(40);
        player.takeVitalityDamage(100);
        player.takeLuckDamage(10);
        player.getsPoisoned();
    }

}
