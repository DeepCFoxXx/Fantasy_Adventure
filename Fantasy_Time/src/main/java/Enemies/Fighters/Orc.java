package Enemies.Fighters;

import Enemies.Fighters.Weapons.IWeaponEnemy;

public class Orc extends Fighter {

    public Orc(String name, int healthValue, int physicalResistance, int magicalResistance, IWeaponEnemy weaponEnemy) {
        super(name, healthValue, physicalResistance, magicalResistance, weaponEnemy);
    }


}
