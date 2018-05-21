package Enemies.Enemy_Magic_Users.Spells;

import Players.Player;

public class Drain implements ISpellEnemy{

    public void cast(Player player) {
        player.takeDamage(100);
        player.takeDefenceDamage(25);
        player.takeVitalityDamage(25);
    }

}
