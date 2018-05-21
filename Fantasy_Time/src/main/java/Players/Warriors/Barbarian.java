package Players.Warriors;


import Players.Warriors.Weapons.IWeapon;

public class Barbarian extends Warrior {

    private int berserkRage;

    public Barbarian(String name, int healthValue, int strength, int magic, int defence, int vitality, int luck, boolean poisoned, IWeapon weapon, int berserkRage) {
        super(name, healthValue, weapon, strength, magic, defence, vitality, luck, poisoned);
        this.berserkRage = berserkRage;
    }

    public int getBerserkRage() {
        return this.berserkRage;
    }

    public void reduceBerserkRage(int value) {
        this.berserkRage -= value;
    }

    public void addToBeserkRage(int value) {
        this.berserkRage += value;
    }

    public void addToLimitBreak() {

        int barbarianBeserkRage = getBerserkRage();

        if (barbarianBeserkRage < 10) {
            addToBeserkRage(100);
            increaseHealth(1000);
            increaseDefence(100);
            increaseVitality(100);
        }
    }

    public void lastChance() {

        int barbarianHealth = getHealthValue();

        if (barbarianHealth < 50) {
            addToBeserkRage(50);
            increaseHealth(300);
            increaseDefence(50);
            increaseVitality(50);
        }
    }


}