package Players;

public abstract class Player {

    private String name;
    private int healthValue;

    public Player(String name, int healthValue){
        this.name = name;
        this.healthValue = healthValue;
    }

}