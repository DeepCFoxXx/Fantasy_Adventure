package Enemies.Fighters;

import Enemies.Fighters.Weapons.IWeaponEnemy;

public class CursedVampire extends Fighter {

    public CursedVampire(String name, int healthValue, int physicalResistance, int magicalResistance, IWeaponEnemy weaponEnemy) {
        super(name, healthValue, physicalResistance, magicalResistance, weaponEnemy);
    }

}
