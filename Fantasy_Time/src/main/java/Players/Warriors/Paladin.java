package Players.Warriors;

import Players.Warriors.Weapons.IWeapon;

public class Paladin extends Warrior {

    private int shieldValue;

    public Paladin(String name, int healthValue, IWeapon weapon, int shieldValue){
        super(name, healthValue, weapon);
        this.shieldValue = shieldValue;
    }

}
