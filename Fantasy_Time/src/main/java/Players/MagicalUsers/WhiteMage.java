package Players.MagicalUsers;

import Players.MagicalUsers.Defenders.IDefend;
import Players.MagicalUsers.Spells.ISpell;

public class WhiteMage extends MagicalUser {

    private int fortification;

    public WhiteMage(String name, int healthValue, int strength, int magic, int defence, int vitality, int luck, boolean poisoned, ISpell spell, IDefend summon, int fortification) {
        super(name, healthValue, spell, summon, strength,  magic, defence, vitality, luck, poisoned);
        this.fortification = fortification;
    }

    public int getFortificationValue() {
        return this.fortification;
    }

    public void takeFortificationDamage(int value) {
        this.fortification -= value;
    }

}
