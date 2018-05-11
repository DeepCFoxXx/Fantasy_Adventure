package Players.Warriors;


import Players.Warriors.Weapons.IWeapon;

public class Barbarian extends Warrior {

    private int vitality;

    public Barbarian(String name, int healthValue, IWeapon weapon, int vitality){
        super(name, healthValue, weapon);
        this.vitality = vitality;
    }

    public int getVitality() {
        return this.vitality;
    }

    public void takeStatDamage(int value) {
        this.vitality -= value;
    }
}
