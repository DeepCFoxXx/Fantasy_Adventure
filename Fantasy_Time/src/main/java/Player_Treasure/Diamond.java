package Player_Treasure;

public class Diamond implements ITreasure{

    private int value;

    public Diamond() {
        this.value = 10000;
    }

    @Override
    public int getValue() {
        return this.value;
    }

}
