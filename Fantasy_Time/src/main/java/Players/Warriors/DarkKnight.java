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

    public void zeroDamage() {
        takeDamage(0);
    }

    public void healthLimit() {

        int healthValue = getHealthValue();

        if (healthValue < 100) {
            increaseArmourValue(200);
            increaseHealth(500);
            increaseDefence(100);
            increaseVitality(100);
        }
    }


    public void increaseArmourValue(int value) {
        this.armourValue =+ value;
    }

}
