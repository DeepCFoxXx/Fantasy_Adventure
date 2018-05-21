package Enemies.Enemy_Magic_Users;

import Enemies.Enemy_Magic_Users.Spells.ISpellEnemy;

public class BloodCultist extends EnemyMagicUser {

    public BloodCultist(String name, int healthValue, int physicalResistance, int magicalResistance, ISpellEnemy spellEnemy) {
        super(name, healthValue, physicalResistance, magicalResistance, spellEnemy);
    }

}
