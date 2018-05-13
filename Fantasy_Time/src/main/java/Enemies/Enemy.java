package Enemies;

import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Player;

public abstract class Enemy {

    private String name;
    private int healthValue;
    private int physicalResistance;
    private int magicalResistance;

    public Enemy(String name, int healthValue, int physicalResistance, int magicalResistance) {
        this.name = name;
        this.healthValue = healthValue;
        this.physicalResistance = physicalResistance;
        this.magicalResistance = magicalResistance;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public void takeDamage(int value) {
        this.healthValue -= value;
    }

    public void attack(Player player, IWeaponEnemy weaponEnemy){
        weaponEnemy.attack(player);
    }

    public int getPhysicalResistance() {
        return this.physicalResistance;
    }

    public void takePhysicalStatDamage(int value) {
        this.physicalResistance -= value;
    }

    public int getMagicalResistance() {
        return this.magicalResistance;
    }

    public void takeMagicalStatDamage(int value) {
        this.magicalResistance -= value;
    }
}
