package Enemies;

import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Player;

public abstract class Enemy {

    private String name;
    private int healthValue;

    public Enemy(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
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
}
