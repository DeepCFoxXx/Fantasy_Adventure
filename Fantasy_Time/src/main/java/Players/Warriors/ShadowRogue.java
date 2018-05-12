package Players.Warriors;

import Players.Warriors.Weapons.IWeapon;

public class ShadowRogue extends Warrior {

    private int stealthValue;

    public ShadowRogue(String name, int healthValue, int strength, int magic, int defence, int vitality, int luck, boolean poisoned, IWeapon weapon, int stealthValue) {
        super(name, healthValue, weapon, strength,  magic, defence, vitality, luck, poisoned);
        this.stealthValue = stealthValue;
    }

    public int getStealthValue() {
        return this.stealthValue;
    }

    public void reduceStealthValue(int value) {
        this.stealthValue -= value;
    }
}
