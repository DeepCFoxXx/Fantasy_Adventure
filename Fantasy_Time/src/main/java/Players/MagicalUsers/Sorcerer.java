package Players.MagicalUsers;

import Players.MagicalUsers.Spells.ISpell;

public class Sorcerer extends MagicalUser {



    public Sorcerer(String name, int healthValue, int strength, int magic, int defence, int vitality, int luck, boolean poisoned, ISpell spell) {
        super(name, healthValue, spell, strength,  magic, defence, vitality, luck, poisoned);
    }

}
