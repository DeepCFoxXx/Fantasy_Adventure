package Players.Warriors;


import Players.Warriors.Weapons.IWeapon;

public class Barbarian extends Warrior {

    private int berserkRage;

    public Barbarian(String name, int healthValue, int strength, int magic, int defence, int vitality, int luck, boolean poisoned, IWeapon weapon, int berserkRage) {
        super(name, healthValue, weapon, strength,  magic, defence, vitality, luck, poisoned);
        this.berserkRage = berserkRage;
    }

    public int getBerserkRage() {
        return this.berserkRage;
    }

    public void reduceBerserkRage(int value) {
        this.berserkRage -= value;
    }

}
