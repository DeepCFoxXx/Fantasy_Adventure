package Players.MagicalUsers.Healing_Spells;

import Players.Player;

public class Cure implements IHeal {

    public void heal(Player player) {
        player.increaseHealth(200);
        player.increaseDefence(10);
        player.increaseVitality(10);
    }

}
