package Enemies.Enemy_Magic_Users.Spells;

import Players.Player;

public class Poison implements ISpellEnemy {

    public void cast(Player player) {
        player.takeDamage(150);
        player.takeDefenceDamage(30);
        player.takeVitalityDamage(30);
        player.getsPoisoned();
    }

}