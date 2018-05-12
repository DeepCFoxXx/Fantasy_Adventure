package Enemies.Fighters;

import Enemies.Fighters.Weapons.IWeaponEnemy;

public class CursedVampire extends Fighter {

    private int thirstValue;

    public CursedVampire(String name, int healthValue, IWeaponEnemy weaponEnemy, int thirstValue) {
        super(name, healthValue, weaponEnemy);
        this.thirstValue = thirstValue;
    }

    public int getThirstValue() {
        return this.thirstValue;
    }
}
