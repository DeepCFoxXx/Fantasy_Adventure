package Players;

import Enemies.Enemy;
import Players.Warriors.Weapons.IWeapon;

public abstract class Player {

    private String name;
    private int healthValue;
    private int strength;
    private int magic;
    private int defence;
    private int vitality;
    private int luck;
    private boolean poisoned;

    public Player(String name, int healthValue){
        this.name = name;
        this.healthValue = healthValue;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public void attack(Enemy enemy, IWeapon weapon){
        weapon.attack(enemy);
    }

    public void takeDamage(int value) {
        this.healthValue -= value;
    }

}