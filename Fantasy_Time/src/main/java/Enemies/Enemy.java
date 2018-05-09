package Enemies;

public abstract class Enemy {

    private String name;
    private int healthValue;

    public Enemy(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
    }

}
