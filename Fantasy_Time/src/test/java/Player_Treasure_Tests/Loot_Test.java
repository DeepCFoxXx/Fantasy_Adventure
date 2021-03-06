package Player_Treasure_Tests;

        import Player_Treasure.*;
        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.assertEquals;

public class Loot_Test {

    Loot loot;
    ITreasure diamond;
    ITreasure goldCoins;
    ITreasure ruby;
    ITreasure silverCoins;

    @Before
    public void before() {
        loot = new Loot();
        diamond = new Diamond();
        goldCoins = new GoldCoins();
        ruby = new Ruby();
        silverCoins = new SilverCoins();
    }

    @Test
    public void lootStartsEmpty() {
        assertEquals(0, loot.getLootCount());
    }

    @Test
    public void canAddToLoot() {
        loot.addTreasure(diamond);
        assertEquals(1, loot.getLootCount());
    }

    @Test
    public void canRemoveLoot() {
        loot.addTreasure(diamond);
        loot.removeTreasure(diamond);
        assertEquals(0, loot.getLootCount());
    }

    @Test
    public void canAddAllLoot() {
        loot.addTreasure(diamond);
        loot.addTreasure(goldCoins);
        loot.addTreasure(ruby);
        loot.addTreasure(silverCoins);
        assertEquals(4, loot.getLootCount());
    }

    @Test
    public void canClearLoot() {
        loot.addTreasure(diamond);
        loot.addTreasure(goldCoins);
        loot.addTreasure(ruby);
        loot.addTreasure(silverCoins);
        loot.clearLoot();
        assertEquals(0, loot.getLootCount());
    }

    @Test
    public void canGetTotalValue() {
        loot.addTreasure(diamond);
        loot.addTreasure(goldCoins);
        loot.addTreasure(ruby);
        loot.addTreasure(silverCoins);
        assertEquals(111100, loot.getTotalLoot());
    }

}
