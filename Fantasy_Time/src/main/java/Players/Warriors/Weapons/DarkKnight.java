package Players.Warriors.Weapons;

import Players.Warriors.Warrior;

public class DarkKnight extends Warrior {

    private int armourValue;

    public DarkKnight(String name, int healthValue, IWeapon weapon, int armourValue){
        super(name, healthValue, weapon);
        this.armourValue = armourValue;
    }
}
