package Enemies.Enemy_Magic_Users;

import Enemies.Enemy;
import Enemies.Fighters.Weapons.IWeaponEnemy;

public class EnemyMagicUser extends Enemy {

    ISpellEnemy spellEnemy;

    public EnemyMagicUser(String name, int healthValue, int physicalResistance, int magicalResistance, ISpellEnemy spellEnemy) {
        super(name, healthValue, physicalResistance, magicalResistance);
        this.spellEnemy = spellEnemy;
    }

}
