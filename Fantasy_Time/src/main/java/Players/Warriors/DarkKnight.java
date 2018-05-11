package Players.Warriors;

import Players.Warriors.Weapons.IWeapon;

public class DarkKnight extends Warrior {

    private int armourValue;

    public DarkKnight(String name, int healthValue, IWeapon weapon, int armourValue){
        super(name, healthValue, weapon);
        this.armourValue = armourValue;
    }

    public int getArmourValue() {
        return this.armourValue;
    }

    public void takeStatDamage(int value) {
        this.armourValue -= value;
    }
}
