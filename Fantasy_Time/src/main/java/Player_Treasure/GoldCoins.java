package Player_Treasure;

public class GoldCoins implements ITreasure {

    private int value;

    public GoldCoins() {
        this.value = 1000;
    }

    public int getValue() {
        return this.value;
    }

}
