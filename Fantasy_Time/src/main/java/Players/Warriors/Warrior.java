package Players.Warriors;

import Enemies.Enemy;
import Players.Player;
import Players.Warriors.Weapons.IWeapon;

public abstract class Warrior extends Player {

    private IWeapon weapon;

    public Warrior(String name, int healthValue, IWeapon weapon, int strength, int magic, int defence, int vitality, int luck, boolean poisoned){
        super(name, healthValue, strength, magic, defence, vitality, luck, poisoned);
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        this.weapon.attack(enemy);
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

}
