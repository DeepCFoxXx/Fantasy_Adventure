package Player_Treasure_Tests;

import Player_Treasure.SilverCoins;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SilverCoins_Test {

    SilverCoins silverCoins;

    @Before
    public void before() {
        silverCoins = new SilverCoins();
    }

    @Test
    public void canGetValue() {
        assertEquals(100, silverCoins.getValue());
    }

}
