package Enemies.Boss_Enemies;

import Enemies.Boss_Enemies.Boss_Weapons.IBossWeapon;
import Enemies.Enemy;
import Players.Player;

public abstract class Boss extends Enemy{

    IBossWeapon bossWeapon;

    public Boss(String name, int healthValue, int physicalResistance, int magicalResistance, IBossWeapon bossWeapon) {
        super(name, healthValue, physicalResistance, magicalResistance);
        this.bossWeapon = bossWeapon;
    }

    public void attack(Player player) {
        this.bossWeapon.attack(player);
    }

    public void setWeapon(IBossWeapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

}
