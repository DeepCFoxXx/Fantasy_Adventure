package Players.MagicalUsers.Healing_Spells;

public class Heal implements IHeal {

    private int healValue;

    public Heal() {
        this.healValue = 100;
    }

    public int getHealValue() {
        return this.healValue;
    }


}
