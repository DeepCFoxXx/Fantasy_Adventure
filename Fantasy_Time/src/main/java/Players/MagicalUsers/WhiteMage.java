package Players.MagicalUsers;

import Players.MagicalUsers.Defenders.IDefend;
import Players.MagicalUsers.Healing_Spells.IHeal;
import Players.MagicalUsers.Spells.ISpell;
import Players.Player;

public class WhiteMage extends MagicalUser {

    private int fortification;
    private IHeal healingSpell;

    public WhiteMage(String name, int healthValue, int strength, int magic, int defence, int vitality, int luck, boolean poisoned, ISpell spell, IDefend summon, int fortification, IHeal healingSpell) {
        super(name, healthValue, spell, summon, strength,  magic, defence, vitality, luck, poisoned);
        this.fortification = fortification;
        this.healingSpell = healingSpell;
    }

    public int getFortificationValue() {
        return this.fortification;
    }

    public void takeFortificationDamage(int value) {
        this.fortification -= value;
    }

    public void heal(Player player, IHeal healingSpell) {
        healingSpell.heal(player);
    }

    public void setHelaingSpell(IHeal healingSpell) {
        this.healingSpell = healingSpell;
    }
}
