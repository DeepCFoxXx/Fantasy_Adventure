package Players.MagicalUsers.Healing_Spells;

public class Cure implements IAddHealth {

    private int healValue;

    public Cure() {
        this.healValue = 250;
    }

    public int getHealValue() {
        return this.healValue;
    }

}
