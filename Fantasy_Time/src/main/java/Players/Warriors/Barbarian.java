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

//    public void addToLimitBreak() {
//
//        int barbarianHealth = getHealthValue();
//        int berserkRage = getBerserkRage();
//
//        if (barbarianHealth < 50) {
//            addToBeserkRage(101);
//        }
//        else if (berserkRage > 100) {
//            increaseHealth(1000);
//            increaseDefence(100);
//            increaseVitality(100);
//        }
//    }

}