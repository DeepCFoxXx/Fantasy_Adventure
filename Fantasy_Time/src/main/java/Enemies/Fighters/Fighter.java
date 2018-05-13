package Enemies.Fighters;

import Enemies.Enemy;
import Enemies.Fighters.Weapons.IWeaponEnemy;
import Players.Player;

public abstract class Fighter extends Enemy {

    private IWeaponEnemy weaponEnemy;

    public Fighter(String name, int healthValue,int physicalResistance, int magicalResistance, IWeaponEnemy weaponEnemy) {
        super(name, healthValue, physicalResistance, magicalResistance);
        this.weaponEnemy = weaponEnemy;
    }

    public void attack(Player player) {
        this.weaponEnemy.attack(player);
    }

    public void setWeapon(IWeaponEnemy weaponEnemy) {
        this.weaponEnemy = weaponEnemy;
    }
}
