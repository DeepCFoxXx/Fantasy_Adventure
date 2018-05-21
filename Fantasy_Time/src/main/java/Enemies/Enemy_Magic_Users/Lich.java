package Enemies.Enemy_Magic_Users;

import Enemies.Enemy_Magic_Users.Spells.ISpellEnemy;

public class Lich extends EnemyMagicUser {

    public Lich(String name, int healthValue, int physicalResistance, int magicalResistance, ISpellEnemy spellEnemy) {
        super(name, healthValue, physicalResistance, magicalResistance, spellEnemy);
    }

}
