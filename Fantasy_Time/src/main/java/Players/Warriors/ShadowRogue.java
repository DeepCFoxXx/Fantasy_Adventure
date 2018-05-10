package Players.Warriors;

import Players.Warriors.Weapons.IWeapon;

public class ShadowRogue extends Warrior {

    private int stealthValue;

    public ShadowRogue(String name, int healthValue, IWeapon weapon, int stealthValue){
        super(name, healthValue, weapon);
        this.stealthValue = stealthValue;
    }

}
