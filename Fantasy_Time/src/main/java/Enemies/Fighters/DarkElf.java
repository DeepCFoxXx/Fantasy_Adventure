package Enemies.Fighters;

import Enemies.Fighters.Weapons.IWeaponEnemy;

public class DarkElf extends Fighter {

    private int magicalResistance;

    public DarkElf(String name, int healthValue, IWeaponEnemy weaponEnemy, int physicalResistance) {
        super(name, healthValue, weaponEnemy);
        this.magicalResistance = magicalResistance;
    }

}
