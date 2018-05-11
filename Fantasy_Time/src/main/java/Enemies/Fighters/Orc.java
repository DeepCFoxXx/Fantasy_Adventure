package Enemies.Fighters;

import Enemies.Fighters.Weapons.IWeaponEnemy;

public class Orc extends Fighter {

    private int physicalResistance;

    public Orc(String name, int healthValue, IWeaponEnemy weaponEnemy, int physicalResistance) {
        super(name, healthValue, weaponEnemy);
        this.physicalResistance = physicalResistance;
    }

    public int getPhysicalResistance() {
        return this.physicalResistance;
    }
}
