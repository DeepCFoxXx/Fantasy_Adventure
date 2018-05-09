package Enemies.Fighters;

import Enemies.Enemy;
import Enemies.Fighters.Weapons.IWeaponEnemy;

public abstract class Fighter extends Enemy {

    private IWeaponEnemy weaponEnemy;

    public Fighter(String name, int healthValue, IWeaponEnemy weaponEnemy) {
        super(name, healthValue);
        this.weaponEnemy = weaponEnemy;
    }

}
