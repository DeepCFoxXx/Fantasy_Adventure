package Players.MagicalUsers;

import Players.MagicalUsers.Defenders.IDefend;
import Players.MagicalUsers.Spells.ISpell;

public class Enchanter extends MagicalUser {

    private int mystification;

    public Enchanter(String name, int healthValue, int strength, int magic, int defence, int vitality, int luck, boolean poisoned, ISpell spell, IDefend summon, int mystification) {
        super(name, healthValue, spell, summon, strength,  magic, defence, vitality, luck, poisoned);
        this.mystification = mystification;
    }

}
