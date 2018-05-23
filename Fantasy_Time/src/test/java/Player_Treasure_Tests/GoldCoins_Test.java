package Player_Treasure_Tests;

import Player_Treasure.GoldCoins;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoldCoins_Test {

    GoldCoins goldCoins;

    @Before
    public void before() {
        goldCoins = new GoldCoins();
    }

    @Test
    public void canGetValue() {
        assertEquals(1000, goldCoins.getValue());
    }

}
