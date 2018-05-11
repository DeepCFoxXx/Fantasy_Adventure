package Enemies.Fighters;

import Enemies.Fighters.Weapons.IWeaponEnemy;

public class DarkElf extends Fighter {

    private int magicalResistance;

    public DarkElf(String name, int healthValue, IWeaponEnemy weaponEnemy, int magicalResistance) {
        super(name, healthValue, weaponEnemy);
        this.magicalResistance = magicalResistance;
    }

    public int getMagicalResistance() {
        return this.magicalResistance;
    }

    public void takeStatDamage(int value) {
        this.magicalResistance -= value;
    }
}
