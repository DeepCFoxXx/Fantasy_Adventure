package Players.MagicalUsers;

import Players.MagicalUsers.Defenders.IDefend;
import Players.MagicalUsers.Spells.ISpell;

public class Sorcerer extends MagicalUser {

    private int illusion;

    public Sorcerer(String name, int healthValue, int strength, int magic, int defence, int vitality, int luck, boolean poisoned, ISpell spell, IDefend summon, int illusion) {
        super(name, healthValue, spell, summon, strength,  magic, defence, vitality, luck, poisoned);
        this.illusion = illusion;
    }

    public int getIllusionValue() {
        return this.illusion;
    }

    public void takeIllusionDamage(int value) {
        this.illusion -= value;
    }
}
