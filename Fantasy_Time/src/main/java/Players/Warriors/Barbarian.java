package Players.Warriors;


import Players.Warriors.Weapons.IWeapon;

public class Barbarian extends Warrior {

    private int berserkRage;

    public Barbarian(String name, int healthValue, IWeapon weapon, int berserkRage) {
        super(name, healthValue, weapon);
        this.berserkRage = berserkRage;
    }

    public int getBerserkRage() {
        return this.berserkRage;
    }

    public void reduceBerserkRage(int value) {
        this.berserkRage -= value;
    }
}
