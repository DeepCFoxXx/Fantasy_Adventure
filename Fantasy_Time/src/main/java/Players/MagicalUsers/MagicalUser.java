package Players.MagicalUsers;

import Enemies.Enemy;
import Players.MagicalUsers.Defenders.IDefend;
import Players.MagicalUsers.Spells.ISpell;
import Players.Player;

public abstract class MagicalUser extends Player {

    private ISpell spell;
    private IDefend summon;

    public MagicalUser(String name, int healthValue, ISpell spell, IDefend summon, int strength, int magic, int defence, int vitality, int luck, boolean poisoned){
        super(name, healthValue, strength, magic, defence, vitality, luck, poisoned);
        this.spell = spell;
        this.summon = summon;
    }

    public void cast(Enemy enemy) {
        this.spell.cast(enemy);
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public void summon(Enemy enemy) {
        this.summon.summon(enemy);
    }

    public void setSummon(IDefend summon) {
        this.summon = summon;
    }
}
