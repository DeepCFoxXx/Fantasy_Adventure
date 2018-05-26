package Player_Treasure;

public class Diamond implements ITreasure{

    private int value;

    public Diamond() {
        this.value = 100000;
    }

    public int getValue() {
        return this.value;
    }

}
