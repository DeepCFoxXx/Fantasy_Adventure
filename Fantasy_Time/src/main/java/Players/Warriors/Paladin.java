package Players.Warriors;

import Players.Warriors.Weapons.IWeapon;

public class Paladin extends Warrior {

    private int shieldValue;

    public Paladin(String name, int healthValue, int strength, int magic, int defence, int vitality, int luck, boolean poisoned, IWeapon weapon, int shieldValue) {
        super(name, healthValue, weapon, strength,  magic, defence, vitality, luck, poisoned);
        this.shieldValue = shieldValue;
    }

    public int getShieldValue() {
        return this.shieldValue;
    }

    public void takeShieldDamage(int value) {
        this.shieldValue -= value;
    }
}
