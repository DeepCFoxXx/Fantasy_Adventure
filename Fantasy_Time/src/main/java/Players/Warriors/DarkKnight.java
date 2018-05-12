package Players.Warriors;

import Players.Warriors.Weapons.IWeapon;

public class DarkKnight extends Warrior {

    private int armourValue;

    public DarkKnight(String name, int healthValue, int strength, int magic, int defence, int vitality, int luck, boolean poisoned, IWeapon weapon, int armourValue) {
        super(name, healthValue, weapon, strength,  magic, defence, vitality, luck, poisoned);
        this.armourValue = armourValue;
    }

    public int getArmourValue() {
        return this.armourValue;
    }

    public void takeArmourDamage(int value) {
        this.armourValue -= value;
    }
}
