package Player_Treasure_Tests;

import Player_Treasure.Diamond;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Diamond_Test {

    Diamond diamond;

    @Before
    public void before() {
        diamond = new Diamond();
    }

    @Test
    public void canGetValue() {
        assertEquals(10000, diamond.getValue());
    }

}
