package Players;

import Enemies.Enemy;
import Players.MagicalUsers.Defenders.IDefend;
import Players.MagicalUsers.Spells.ISpell;
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

    public Player(String name, int healthValue, int strength, int magic, int defence, int vitality, int luck, boolean poisoned){
        this.name = name;
        this.healthValue = healthValue;
        this.strength = strength;
        this.magic = magic;
        this.defence = defence;
        this.vitality = vitality;
        this.luck = luck;
        this.poisoned = false;
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

    public int getStrength() {
        return this.strength;
    }

    public int getMagic() {
        return this.magic;
    }

    public int getDefence() {
        return this.defence;
    }

    public int getVitality() {
        return this.vitality;
    }

    public int getLuck() {
        return this.luck;
    }

    public boolean getPoisonStatus() {
        return this.poisoned;
    }

    public void getsPoisoned() {
        this.poisoned = true;
    }

    public void takeDefenceDamage(int value) {
        this.defence -= value;
    }

    public void takeVitalityDamage(int value) {
        this.vitality -= value;
    }

    public void cast(Enemy enemy, ISpell spell) {
        spell.cast(enemy);
    }

    public void summon(Enemy enemy, IDefend summon) {
        summon.summon(enemy);
    }


    public void poisonedEffects() {

        boolean x = poisoned;

        if (!x) {
            takeDamage(20);
            takeVitalityDamage(10);
            takeDefenceDamage(5);
        }

    }

    public void increaseHealth(int value) {
        this.healthValue += value;
    }
}