package Enemies.Boss_Enemies;

import Enemies.Boss_Enemies.Boss_Weapons.IBossWeapon;

public class MasterVampire extends Boss{

    IBossWeapon bossWeapon;

    public MasterVampire(String name, int healthValue, int physicalResistance, int magicalResistance, IBossWeapon bossWeapon) {
        super(name, healthValue, physicalResistance, magicalResistance, bossWeapon);
        this.bossWeapon = bossWeapon;
    }

}
