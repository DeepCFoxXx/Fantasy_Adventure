package Enemies.Fighters;

import Enemies.Fighters.Weapons.IWeaponEnemy;

public class HellKnight extends Fighter {

    private int rageValue;

    public HellKnight(String name, int healthValue, IWeaponEnemy weaponEnemy, int rageValue) {
        super(name, healthValue, weaponEnemy);
        this.rageValue = rageValue;
    }

    public int getRageValue() {
        return this.rageValue;
    }
}
