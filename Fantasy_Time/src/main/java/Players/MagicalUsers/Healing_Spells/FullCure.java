package Players.MagicalUsers.Healing_Spells;

import Players.Player;

public class FullCure implements IHeal {

    public void heal(Player player) {
        player.increaseHealth(500);
        player.increaseDefence(50);
        player.increaseVitality(50);
        player.curePoison();
    }

}
