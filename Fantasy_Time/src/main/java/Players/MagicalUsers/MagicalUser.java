package Players.MagicalUsers;

import Players.MagicalUsers.Spells.ISpell;
import Players.Player;

public class MagicalUser extends Player {

    private ISpell spell;

    public MagicalUser(String name, int healthValue, ISpell spell, int strength, int magic, int defence, int vitality, int luck, boolean poisoned){
        super(name, healthValue, strength, magic, defence, vitality, luck, poisoned);
        this.spell = spell;
    }

}
